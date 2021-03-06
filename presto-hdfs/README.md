# Presto HDFS Connector

The HDFS Connector turns HDFS into a reliable and scalable storage for data with schema provided by MetaServer.

## Connector in detail

After analyzing implementations of other connectors such as Hive and JDBC, we give a guidance on how to implement your
own connector.

### Tips 
Set up Maven and don't forget to read __`checkstyle`__ carefully.

### Design & Implementation
When implementing a new Presto plugin, implement interfaces and override methods defined by the SPI.

Plugins can provide additional Connectors, Types, Functions and System Access Control. Currently, we focus on Connector
mostly. Following are list of important SPI interfaces.

#### Plugin
Override `getConnectorFactories` method in `com.facebook.presto.spi.Plugin`, and return a customized `ConnectorFactory`

#### ConnectorFactory
Instances of `Connector` are created by a `ConnectorFactory` in dependency injection way. Additionally, `ConnectorFactory` provides 
a `ConnectorHandleResolver`.

#### Connector
`Connector` returns instances of the following services:
+ `ConnectorMetadata`: metadata interface allowing Presto to get list of schemas, tables, columns, etc.
+ `ConnectorSplitManager`: split manager that partitions table into individual chunks that Presto will distribute to workers for processing.
+ `ConnectorPageSourceProvider`: given transaction, split and columns, the page source provider creates PageSource for memory layout.

Connector methods in detail:
+ ~~`beginTransaction`~~
+ ~~`commit`~~
+ ~~`rollback`~~
+ ~~`getMetadata`~~
+ ~~`getSplitManager`~~
+ ~~`getPageSourceProvider`~~
+ ~~`getPageSinkProvider`~~
+ ~~`getNodePartitioningProvider`~~
+ ~~`getSystemTables`~~
+ ~~`shutdown`~~

#### ConnectorMetadata
Most of methods in ConnectorMetadata will be provided by MetaServer, and converted to SQL queries eventually to a JDBC database.

Related interfaces:
+ `ConnectorTableLayout`: provides information about a table's columns, partitions, domains, etc.

Methods in detail:
+ __`commit`__
+ __`rollback`__
+ __`listSchemaNames`__: list all schema names provided by this connector
+ __`getTableHandle`__: given SchemaTableName, return TableHandle
+ __`getTableLayouts`__: given TableHandle and list of columns, return list of TableLayoutResult
+ __`getTableLayout`__: given TableLayoutHandle, return TableLayout
+ __`getTableMetadata`__: given TableHandle, return TableMetadata.
+ __`listTables`__: optionally given schema, return list of SchemaTableName
+ __`getColumnHandles`__: given a TableHandle, return a map of Columns, which maps column name to ColumnHandle
+ __`getColumnMetadata`__: given a TableHandle and a ColumnHandle, return the ColumnMetadata
+ __`listTableColumns`__: given a table prefix, list all columns of tables that match the prefix
+ `createSchema`
+ `dropSchema`
+ `renameSchema`
+ `createTable`
+ `dropTable`
+ `renameTable`
+ `dropView`
+ `listViews`
+ `getViews`

#### ConnectorSplitManager
Split is the minimal task execution unit that distributed to workers. As for Parquet, each split contains several RowGroups.
Firstly, splits are mapped to HDFS blocks, and then mapped to Parquet row groups further.

Related interfaces:
+ `ConnectorSplitSource`: return list of ConnectorSplit asynchronously
+ `ConnectorSplit`: provide split related info such as located HostAddress, table, partition, etc.

Methods in detail:
+ __`getSplits`__: given TransactionHandle and TableLayoutHandle, return SplitSource.
+ __`getPartitionMetadata`__: given Table, SchemaTableName, list of Partition, return a Iterator of PartitionMetadata

#### ConnectorPageSourceProvider
PageSourceProvider creates PageSource from Split.

Methods in detail:
+ __`createPageSource`__: given Split and list of ColumnHandle, return PageSource

#### ParquetReader

### Roadmap
