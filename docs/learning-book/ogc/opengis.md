# OpenGis简介

​	OpenGIS(Open Geodata Interoperation Specification,OGIS-开放的地理数据互操作规范)由美国OGC(OpenGIS协会，Open Geospatial Consortium)提出。OGC是一个非盈利性组织，目的是促进采用新的技术和商业方式来提高地理信息处理的互操作性(Interoperability)，它致力于消除地理信息应用（如地理信息系统，遥感，土地信息系统，自动制图/设施管理(AM/FM)系统）之间以及地理应用与其它信息技术应用之间的藩篱，建立一个无“边界”的、分布的、基于构件的地理数据互操作环境。

​	OpenGIS定义了一组基于数据的服务，而数据的基础是要素（Feature）。所谓要素简单地说就是一个独立的对象，在地图中可能表现为一个多边形建筑物，在数据库中即一个独立的条目。要素具有两个必要的组成部分，几何信息和属性信息。OpenGIS将几何信息分为点、边缘、面和几何集合四种：其中我们熟悉的线（Linestring）属于边缘的一个子类，而多边形（Polygon）是面的一个子类。也就是说OpenGIS定义的几何类型并不仅仅是我们常见的点、线、多边形三种，它提供了更复杂更详细的定义，增强了未来的可扩展性。另外，几何类型的设计中采用了组合模式（Composite），将几何集合（GeometryCollection）也 定义为一种几何类型，类似地，要素集合（FeatureCollection）也是一种要素。属性信息没有做太大的限制，可以在实际应用中结合具体的实现进行设置。 相同的几何类型、属性类型的组合成为要素类型（FeatureType），要素类型相同的要素可以被存放在一个数据源中。而一个数据源只能拥有一个要素类型。因此，可以用要素类型来描述一组属性相似的要素。在面向对象的模型中，完全可以把要素类型理解为一个类，而要素则是类的实例。 通过GIS中间件可以从数据源中取出数据，供WMS服务器和WFS服务器使用。