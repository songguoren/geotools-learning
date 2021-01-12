# 创建GeoTools
> 通过factories工厂类去初始化操作类： `Features`, `Styles`, `Filters`, `DataStores`, and `MathTransforms`

## 例如
```
FilterFactory2 factory = CommonFactoryFinder.getFilterFactory2( null );
Filter filter = factory.less( factory.property( "size" ), factory.literal( 2 ) );

if( filter.evaulate( feature )){
   System.out.println( feature.getId() + " had a size larger than 2" );
}
```

In this example we:

1. Found an object which implements the GeoAPI `FilterFactory2` interface using a `FactoryFinder`.

   (`CommonFactoryFinder` gave us `FilterFactoryImpl` in this case)

2. Used the Factory to produce our Instance.

   (`FilterFactoryImpl.less(..)` method was used to create a `PropertyIsLessThan` Filter)

3. Used the instance to accomplish something.

   (we used the filter to check the size of a `Feature` )

## `FactoryFinder` Reference

###  CommonFactoryFinder

- `FilterFactory`
- `StyleFactory`
- `Function`
- `FileDataStore` - factory used to work with file data stores
- `FeatureFactory` - factory used to create features
- `FeatureTypeFactory` - factory used to create feature type description
- `FeatureCollections` - factory used to create feature collection

### 特征(向量)获取方法

- `DataAccessFinder` - listing `DataAccessFactory` for working with feature data
- `DataStoreFinder` - lists `DataStoreFactorySpi` limited to simple features
- `FileDataStoreFinder` - Create of `FileDataStoreFactorySpi` instances limited to file formats

### 栅格获取方法

- `GridFormatFinder` - access to `GridFormatFactorySpi` supporting raster formats
- `CoverageFactoryFinder` - access to `GridCoverageFactory`

###  JTSFactoryFinder 
>used to create JTS GeometryFactory and PercisionModel

- `GeometryFactory`
- `PrecisionModel`
### ReferencingFactoryFinder 
>used to list referencing factories

- `DatumFactory`
- `CSFactory`
- `DatumAuthorityFactory`
- `CSAuthorityFactory`
- `CRSAuthorityFactory`
- `MathTransformFactory`
- `CoordinateOperationFactory`
- `CoordinateOperationAuthorityFactory`