HBase Spike
=================================
HBase的Demo项目，包括HBase原生API，Gora，Kundera和Spring Hadoop几者支持

### 说明

* HBase API http://hbase.apache.org/0.94/apidocs/index.html
* Gora: 代码生成方式操作HBase, http://gora.apache.org/
* Spring Hadoop: 通过HBase Template方式操作, http://projects.spring.io/spring-hadoop/
* Kundera: JPA方式操作HBase, https://github.com/impetus-opensource/Kundera
* Phoenix: JDBC方式操作HBase, http://phoenix.incubator.apache.org/

### Todo

* Gora的bytes to object逻辑提前
* Kundera使用Spring管理的HBase配置和连接

### 连接远程hbase

       HBASE_OPTS="-Dhbase.zookeeper.quorum='dev.mvnsearch.net:2181'" ./hbase shell
