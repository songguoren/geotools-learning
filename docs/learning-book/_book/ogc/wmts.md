# wmts服务简介
WMTS服务，全称是Web Map Tile Service (web地图切片服务)，目前OGC提供的最新版本是1.0.0，WMTS是OGC首个支持restful风格的服务标准，提供了如下几种操作：

1. GetCapabilities：获取服务的元数据信息，请求格式支持KVP，SOAP和RESTFUL，其请求参数如下

   ![wmts-capabilityjpg](..\assets\wmts-capabilityjpg.jpg)

2. GetTile：获取服务的切片信息，GetTile：获取服务的切片信息

   ![wmts-title](..\assets\wmts-title.jpg)

3. GetFeatureInfo：获取点选的要素信息，GetFeatureInfo：获取点选的要素信息

![wmts-feature](..\assets\wmts-feature.jpg)