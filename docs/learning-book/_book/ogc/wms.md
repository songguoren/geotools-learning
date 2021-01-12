# WMS服务简介

​	WMS服务全称是Web Map Service （web地图服务），目前OGC提供的WMS最新版本为1.3.0，并提供了如下的操作接口：请求格式支持KVP和SOAP

1. GetCapabilities：获取服务中的要素及支持的操作

   ![](..\assets\capabilities.jpg)

2. GetMap：获取地图数据

   ![](..\assets\map.jpg)

3. GetFeatureInfo：获取getMap响应地图上某一点的特征数据信息

   ![](..\assets\featureinfo.jpg)