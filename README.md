# CGDN-SpringBoot-ElasticSearch 
## Install elasticsearch and configure
+ https://www.elastic.co/downloads/elasticsearch <br>
+ Chỉnh sửa file application properties giống như trong file confgure của ES <br>
cluster.name: mkyong-cluster <br>
+ Bật 1 node lên trên elasticsearch
node.name: node-1 <br>

## Các câu query phổ biến
https://viblo.asia/p/23-cau-truy-van-huu-ich-trong-elasticsearch-phan-1-Ljy5VoMbKra <br>
http://moliware.com/es-dsl-cheatsheet/ <br>

## Cheatsheet 
# Elasticsearch Cheatsheet - an overview of commonly used Elasticsearch API commands <br>

# cat paths <br>
/_cat/allocation <br>
/_cat/shards <br>
/_cat/shards/{index} <br>
/_cat/master <br>
/_cat/nodes <br>
/_cat/indices <br>
/_cat/indices/{index} <br>
/_cat/segments <br>
/_cat/segments/{index}<br>
/_cat/count<br>
/_cat/count/{index}<br>
/_cat/recovery<br>
/_cat/recovery/{index}<br>
/_cat/health<br>
/_cat/pending_tasks<br>
/_cat/aliases<br>
/_cat/aliases/{alias}<br>
/_cat/thread_pool<br>
/_cat/plugins<br>
/_cat/fielddata<br>
/_cat/fielddata/{fields}<br>

# Important Things<br>
bin/elasticsearch                                                       # Start Elastic instance <br>
curl -X GET  'http://localhost:9200/?pretty=true'                       # View instance metadata <br>
curl -X POST 'http://localhost:9200/_shutdown'                          # Shutdown Elastic instance <br>
curl -X GET 'http://localhost:9200/_cat?pretty=true'                    # List all admin methods <br>
curl -X GET 'http://localhost:9200/_cat/indices?pretty=true'            # List all indices <br>
curl -X GET 'http://localhost:9200/_cluster/health?pretty=true'         # View Cluster Health <br>

# Index, Type Basics<br>
curl -X GET  'http://localhost:9200/<index name>'                       # View specific index <br>
curl -X POST 'http://localhost:9200/<index name>'                       # Create an index <br>
curl -X DELETE 'http://localhost:9200/<index name>'                     # Delete an index <br>

curl -X GET  'http://locahost:9200/<index name>/<type>/<id>'            # Retrieve a specific document <br>
curl -X POST 'http://locahost:9200/<index name>/<type>/'                # Create a document <br>
curl -X PUT  'http://locahost:9200/<index name>/<type>/<id>'            # Create/Update a specific document <br>
curl -X DELETE 'http://localhost:9200/<index name>/<type>/<id>'         # Delete a specific document <br>

curl -X GET  'http://localhost:9200/<index name>/_mappings'             # View mappings for index <br>
curl -X GET  'http://localhost:9200/<index name>/_settings'             # View setting information for an index <br>

curl -X GET  'http://localhost:9200/<index name>/<type>/_mappings'      # View mappings for an index type<br>
curl -X GET  'http://localhost:9200/<index name>/<type>/_settings'      # View setting information for an index type<br>

curl -X GET  'http://localhost:9200/<index name>/_search'               # Search an index<br>
curl -X GET  'http://localhost:9200/<index name>/<type>/_search'        # Search an index type<br>

# Bulk API<br>
curl -X GET 'http://localhost:9200/_bulk'        <br>                       
curl -X GET 'http://localhost:9200/<index name>/_bulk' <br>
curl -X GET 'http://localhost:9200/<index name>/<type>/_bulk' <br>

# Elastic River Basics<br>
curl -X GET 'http://localhost:9200/_river/_meta'                      # View River settings<br>
curl -X GET 'http://localhost:9200/_river/<index name>/_meta'         # View River meta data for index<br>
curl -X GET 'http://localhost:9200/_river/<index name>/_meta/_source' # View River source for index<br>
curl -X GET 'http://localhost:9200/_river/<index name>/_status'       # View River status<br>
curl -X GET 'http://localhost:9200/_river/<index name>/_search'       # Seach the River Index<br>
