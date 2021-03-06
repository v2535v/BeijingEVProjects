package com.earthview.world.spatial;

import global.*;
import com.earthview.world.base.*;
import com.earthview.world.util.*;
import com.earthview.world.core.*;

/**
 * EarthViewWMS图层类
 */
public class Evwmsmaplayer extends com.earthview.world.spatial.WebLayer {
	
	static {
		GlobalClassFactoryMap.put("EarthView::World::Spatial::CEVWMSMapLayer", new EvwmsmaplayerClassFactory());
		GlobalClassFactoryMap.put("EarthView::World::Spatial::JCEVWMSMapLayerProxy", new EvwmsmaplayerClassFactory());
	}

	native private long getWMSCapabilitiesRef_void(long pNativeObject);
	/**
	 * 获取GOC元数据信息
	 * @return OGC元数据对象指针
	 */
	public com.earthview.world.spatial.Wmsserverinfo getWMSCapabilitiesRef()
	{
		long returnValue = getWMSCapabilitiesRef_void(this.nativeObject.pointer);
		if(returnValue == 0L) {
			return null;
		}
		com.earthview.world.spatial.Wmsserverinfo __returnValue = new com.earthview.world.spatial.Wmsserverinfo(CreatedWhenConstruct.CWC_NotToCreate, "CWMSServerInfo");
		__returnValue.setDelegate(true);
		InstancePointer __instancePointer = new InstancePointer(returnValue);
		__returnValue.setInstancePointer(__instancePointer);
		IClassFactory __returnValueClassFactory = GlobalClassFactoryMap.get(__returnValue.getCppInstanceTypeName());
		if (__returnValueClassFactory != null)
		{
			__returnValue.setDelegate(true);
			__returnValue = (com.earthview.world.spatial.Wmsserverinfo)__returnValueClassFactory.create();
			__returnValue.setDelegate(true);
			__returnValue.bindNativeObject(__instancePointer, "CWMSServerInfo");
		}
		return __returnValue;
	}
	native private boolean draw_ISpatialDisplay_EVVectorLayerRendererType(long pNativeObject, long display, int type);
	/**
	 * 渲染
	 * @param display 渲染设备信息
	 * @param type 渲染类型
	 * @return 成功返回true
	 */
	public boolean draw(com.earthview.world.spatial.display.Ispatialdisplay display, com.earthview.world.spatial.atlas.EVVectorLayerRendererType type)
	{
		long displayParamValue = (display == null ? 0L : display.nativeObject.pointer);
		int typeParamValue = type.getValue();
		boolean returnValue = draw_ISpatialDisplay_EVVectorLayerRendererType(this.nativeObject.pointer, displayParamValue, typeParamValue);
		return returnValue;
	}
	native private boolean draw_ISpatialDisplay_EVVectorLayerRendererType_NoVirtual(long pNativeObject, long display, int type);
	protected boolean draw_NoVirtual(com.earthview.world.spatial.display.Ispatialdisplay display, com.earthview.world.spatial.atlas.EVVectorLayerRendererType type)
	{
		long displayParamValue = (display == null ? 0L : display.nativeObject.pointer);
		int typeParamValue = type.getValue();
		boolean returnValue = draw_ISpatialDisplay_EVVectorLayerRendererType_NoVirtual(this.nativeObject.pointer, displayParamValue, typeParamValue);
		return returnValue;
	}

	native private int getMap_EVString_EVString_EVSSCSRS_IEnvelope_ev_uint32_ev_uint32_EVSSCImageType_ev_bool_ev_int32_ev_int32_ev_int32_EVString_EVString_CMemoryStreamResult(long pNativeObject, String layers, String styles, int srs, long maprect, long width, long height, int format, boolean transparent, int red, int green, int blue, String time, String elevation, long serverresult);
	/**
	 * 获取指定地图
	 * @param layers 图层
	 * @param styles 风格
	 * @param srs 投影
	 * @param maprect 范围
	 * @param width 图片宽
	 * @param height 图片高
	 * @param format 图片格式
	 * @param transparent true表示背景透明
	 * @param red 背景r值
	 * @param green 背景g值
	 * @param blue 背景b值
	 * @param time 时间，可为空
	 * @param elevation 高程，可为空
	 * @param serverresult 查询结果
	 * @return ok返回0，其他值均为错误
	 */
	public int getMap(String layers, String styles, com.earthview.world.spatial.EVSSCSRS srs, com.earthview.world.spatial.geometry.Ienvelope maprect, long width, long height, com.earthview.world.spatial.EVSSCImageType format, boolean transparent, int red, int green, int blue, String time, String elevation, com.earthview.world.spatial.MemoryStreamResult serverresult)
	{
		String layersParamValue = layers;
		String stylesParamValue = styles;
		int srsParamValue = srs.getValue();
		long maprectParamValue = (maprect == null ? 0L : maprect.nativeObject.pointer);
		long widthParamValue = width;
		long heightParamValue = height;
		int formatParamValue = format.getValue();
		boolean transparentParamValue = transparent;
		int redParamValue = red;
		int greenParamValue = green;
		int blueParamValue = blue;
		String timeParamValue = time;
		String elevationParamValue = elevation;
		long serverresultParamValue = serverresult.nativeObject.pointer;
		int returnValue = getMap_EVString_EVString_EVSSCSRS_IEnvelope_ev_uint32_ev_uint32_EVSSCImageType_ev_bool_ev_int32_ev_int32_ev_int32_EVString_EVString_CMemoryStreamResult(this.nativeObject.pointer, layersParamValue, stylesParamValue, srsParamValue, maprectParamValue, widthParamValue, heightParamValue, formatParamValue, transparentParamValue, redParamValue, greenParamValue, blueParamValue, timeParamValue, elevationParamValue, serverresultParamValue);
		return returnValue;
	}
	native private int getFeatureInfo_EVString_EVSSCSRS_IEnvelope_ev_uint32_ev_uint32_ev_uint32_ev_int32_ev_int32_EVString(long pNativeObject, String layers, int srs, long maprect, long width, long height, long featurecount, int x, int y, long value);
	/**
	 * 获取指定要素信息
	 * @param layers 图层
	 * @param srs 投影
	 * @param maprect 范围
	 * @param width 图片宽
	 * @param height 图片高
	 * @param featurecount 返回的要素数目
	 * @param x 图片位置像素值x
	 * @param y 图片位置像素值y
	 * @param value 查询结果
	 * @return ok返回0，其他值均为错误
	 */
	public int getFeatureInfo(String layers, com.earthview.world.spatial.EVSSCSRS srs, com.earthview.world.spatial.geometry.Ienvelope maprect, long width, long height, long featurecount, int x, int y, StringPointer value)
	{
		String layersParamValue = layers;
		int srsParamValue = srs.getValue();
		long maprectParamValue = (maprect == null ? 0L : maprect.nativeObject.pointer);
		long widthParamValue = width;
		long heightParamValue = height;
		long featurecountParamValue = featurecount;
		int xParamValue = x;
		int yParamValue = y;
		long valueParamValue = value.nativeObject.pointer;
		int returnValue = getFeatureInfo_EVString_EVSSCSRS_IEnvelope_ev_uint32_ev_uint32_ev_uint32_ev_int32_ev_int32_EVString(this.nativeObject.pointer, layersParamValue, srsParamValue, maprectParamValue, widthParamValue, heightParamValue, featurecountParamValue, xParamValue, yParamValue, valueParamValue);
		return returnValue;
	}
	native private int getLayerLegend_EVString_ev_uint32_ev_uint32_CMemoryStreamResult(long pNativeObject, String layer, long legendwidth, long legendheight, long serverresult);
	/**
	 * 获取图例
	 * @param layer 查询图层
	 * @param legendwidth 图例宽
	 * @param legendheight 图例高
	 * @param serverresult 结果
	 * @return ok返回0，其他值均为错误
	 */
	public int getLayerLegend(String layer, long legendwidth, long legendheight, com.earthview.world.spatial.MemoryStreamResult serverresult)
	{
		String layerParamValue = layer;
		long legendwidthParamValue = legendwidth;
		long legendheightParamValue = legendheight;
		long serverresultParamValue = serverresult.nativeObject.pointer;
		int returnValue = getLayerLegend_EVString_ev_uint32_ev_uint32_CMemoryStreamResult(this.nativeObject.pointer, layerParamValue, legendwidthParamValue, legendheightParamValue, serverresultParamValue);
		return returnValue;
	}
	native private long getLayerInfoRef_void(long pNativeObject);
	/**
	 * 获取元数据信息，如果是mapDataset指针转成CEVWMSMapInfo,否则转成CEVMapLayerInfo
	 * @return 源数据对象指针
	 */
	public com.earthview.world.spatial.geodataset.Idatametainfo getLayerInfoRef()
	{
		long returnValue = getLayerInfoRef_void(this.nativeObject.pointer);
		if(returnValue == 0L) {
			return null;
		}
		com.earthview.world.spatial.geodataset.Idatametainfo __returnValue = new com.earthview.world.spatial.geodataset.Idatametainfo(CreatedWhenConstruct.CWC_NotToCreate, "IDataMetaInfo");
		__returnValue.setDelegate(true);
		InstancePointer __instancePointer = new InstancePointer(returnValue);
		__returnValue.setInstancePointer(__instancePointer);
		IClassFactory __returnValueClassFactory = GlobalClassFactoryMap.get(__returnValue.getCppInstanceTypeName());
		if (__returnValueClassFactory != null)
		{
			__returnValue.setDelegate(true);
			__returnValue = (com.earthview.world.spatial.geodataset.Idatametainfo)__returnValueClassFactory.create();
			__returnValue.setDelegate(true);
			__returnValue.bindNativeObject(__instancePointer, "IDataMetaInfo");
		}
		return __returnValue;
	}
	/**
	 * 构造函数
	 */
	public Evwmsmaplayer() {
		super(CreatedWhenConstruct.CWC_NotToCreate);
		Create("JCEVWMSMapLayerProxy", null, true);
		this.registerCallback();
		if (!"com.earthview.world.spatial.Evwmsmaplayer".equals(this.getClass().getName()))
		{
			this.setCustomExtend(true);
		}
	}

	native private void setRenderLayers_EVString(long pNativeObject, String layers);
	/**
	 * 设置渲染图层
	 * @param layers 渲染图层
	 */
	public void setRenderLayers(String layers)
	{
		String layersParamValue = layers;
		setRenderLayers_EVString(this.nativeObject.pointer, layersParamValue);
	}
	native private String getRenderLayers_void(long pNativeObject);
	/**
	 * 获取渲染图层
	 * @return 渲染图层
	 */
	public String getRenderLayers()
	{
		String returnValue = getRenderLayers_void(this.nativeObject.pointer);
		return returnValue;
	}
	native private void setRenderStyles_EVString(long pNativeObject, String styles);
	/**
	 * 设置渲染风格标识
	 * @param styles 渲染风格标识
	 */
	public void setRenderStyles(String styles)
	{
		String stylesParamValue = styles;
		setRenderStyles_EVString(this.nativeObject.pointer, stylesParamValue);
	}
	native private String getRenderStyles_void(long pNativeObject);
	/**
	 * 获取渲染风格标识
	 * @return 渲染风格标识
	 */
	public String getRenderStyles()
	{
		String returnValue = getRenderStyles_void(this.nativeObject.pointer);
		return returnValue;
	}
	native private void setRenderDataTime_EVString(long pNativeObject, String value);
	/**
	 * 设置渲染所用数据的时间
	 * @param value 数据时间
	 */
	public void setRenderDataTime(String value)
	{
		String valueParamValue = value;
		setRenderDataTime_EVString(this.nativeObject.pointer, valueParamValue);
	}
	native private String getRenderDataTime_void(long pNativeObject);
	/**
	 * 获取指点的数据时间
	 * @return 数据时间信息
	 */
	public String getRenderDataTime()
	{
		String returnValue = getRenderDataTime_void(this.nativeObject.pointer);
		return returnValue;
	}
	native private void setRenderElevetion_EVString(long pNativeObject, String elevation);
	/**
	 * 设置渲染高程
	 * @param elevation 高程信息
	 */
	public void setRenderElevetion(String elevation)
	{
		String elevationParamValue = elevation;
		setRenderElevetion_EVString(this.nativeObject.pointer, elevationParamValue);
	}
	native private String getRenderElevation_void(long pNativeObject);
	/**
	 * 获取渲染高程
	 * @return 渲染高程信息
	 */
	public String getRenderElevation()
	{
		String returnValue = getRenderElevation_void(this.nativeObject.pointer);
		return returnValue;
	}
	native private void setRenderBackColor_ev_bool_ev_int32_ev_int32_ev_int32(long pNativeObject, boolean transparent, int red, int green, int blue);
	/**
	 * 设置渲染背景信息
	 * @param transparent 背景是否透明
	 * @param red r值
	 * @param green g值
	 * @param blue b值
	 */
	public void setRenderBackColor(boolean transparent, int red, int green, int blue)
	{
		boolean transparentParamValue = transparent;
		int redParamValue = red;
		int greenParamValue = green;
		int blueParamValue = blue;
		setRenderBackColor_ev_bool_ev_int32_ev_int32_ev_int32(this.nativeObject.pointer, transparentParamValue, redParamValue, greenParamValue, blueParamValue);
	}
	native private void getRenderBackColor_ev_bool_ev_int32_ev_int32_ev_int32(long pNativeObject, long transparent, long red, long green, long blue);
	/**
	 * 获取渲染背景信息
	 * @param transparent 背景是否透明
	 * @param red r值
	 * @param green g值
	 * @param blue b值
	 */
	public void getRenderBackColor(BooleanPointer transparent, IntegerPointer red, IntegerPointer green, IntegerPointer blue)
	{
		long transparentParamValue = transparent.nativeObject.pointer;
		long redParamValue = red.nativeObject.pointer;
		long greenParamValue = green.nativeObject.pointer;
		long blueParamValue = blue.nativeObject.pointer;
		getRenderBackColor_ev_bool_ev_int32_ev_int32_ev_int32(this.nativeObject.pointer, transparentParamValue, redParamValue, greenParamValue, blueParamValue);
	}
	native private void setDataset_IDataset(long pNativeObject, long ref_dataset);
	/**
	 * 设置关联数据集，需外部释放
	 * @param dataset 数据机对象
	 */
	public void setDataset(com.earthview.world.spatial.geodataset.Idataset ref_dataset)
	{
		long ref_datasetParamValue = (ref_dataset == null ? 0L : ref_dataset.nativeObject.pointer);
		setDataset_IDataset(this.nativeObject.pointer, ref_datasetParamValue);
	}
	public Evwmsmaplayer(CreatedWhenConstruct cwc) {
		super(CreatedWhenConstruct.CWC_NotToCreate);
	}
	public Evwmsmaplayer(CreatedWhenConstruct cwc, String classNameStr) {
		super(CreatedWhenConstruct.CWC_NotToCreate, classNameStr);
	}
	
	/**
	 * 获取是否可选
	 * @return true表示可选
	 */
	public boolean isSelected()
	{
		return super.isSelected_NoVirtual();
	}
	/**
	 * 设置是否可选
	 * @param selected true表示可选
	 */
	public void setSelected(boolean selected)
	{
		super.setSelected_NoVirtual(selected);
	}
	/**
	 * 获取图层类型
	 * @param  
	 * @return 图层类型
	 */
	public com.earthview.world.spatial.atlas.EVLayerType getType()
	{
		return super.getType_NoVirtual();
	}
	/**
	 * 获取与图层所关联的数据集
	 * @param  
	 * @return 数据集
	 */
	public com.earthview.world.spatial.geodataset.Idataset getDataset()
	{
		return super.getDataset_NoVirtual();
	}
	/**
	 * 获取数据集的名称
	 * @param  
	 */
	public String getDatasetName()
	{
		return super.getDatasetName_NoVirtual();
	}
	/**
	 * 获取数据集所在的数据源
	 * @param  
	 */
	public com.earthview.world.spatial.geodataset.Idatasource getDataSource()
	{
		return super.getDataSource_NoVirtual();
	}
	/**
	 * 图层选择
	 * @param filter 选择过滤条件
	 * @param type 选择类型
	 */
	public void select(com.earthview.world.spatial.geodataset.Iqueryfilter filter, com.earthview.world.spatial.atlas.EVSelectionResultType type)
	{
		super.select_NoVirtual(filter, type);
	}
	/**
	 * 清空图层选择
	 * @param  
	 */
	public void clearSelection()
	{
		super.clearSelection_NoVirtual();
	}
	/**
	 * 设置图层的选择集
	 * @param selection 图层的选择集
	 */
	public void setLayerSelection(com.earthview.world.spatial.atlas.Ilayerselection selection)
	{
		super.setLayerSelection_NoVirtual(selection);
	}
	/**
	 * 获取图层选择
	 * @param  
	 * @return 图层选择
	 */
	public com.earthview.world.spatial.atlas.Ilayerselection getLayerSelection()
	{
		return super.getLayerSelection_NoVirtual();
	}
	/**
	 * 获取图层的名称
	 * @param  
	 * @return 图层名称
	 */
	public String getName()
	{
		return super.getName_NoVirtual();
	}
	/**
	 * 设置图层的名称
	 * @param name 图层名称
	 */
	public void setName(String name)
	{
		super.setName_NoVirtual(name);
	}
	/**
	 * 获取图层的描述信息
	 * @param  
	 * @return 描述信息
	 */
	public String getDescription()
	{
		return super.getDescription_NoVirtual();
	}
	/**
	 * 设置图层的描述信息
	 * @param value 描述信息
	 */
	public void setDescription(String value)
	{
		super.setDescription_NoVirtual(value);
	}
	/**
	 * 检测图层图层是否可以编辑
	 * @param  
	 * @return 如果图层可以编辑,则返回true,反之则否
	 */
	public boolean canEdit()
	{
		return super.canEdit_NoVirtual();
	}
	/**
	 * 设置图层是否可以支持编辑
	 * @param can 如果为true,则图层可以编辑,反之则否
	 */
	public void setCanEdit(boolean can)
	{
		super.setCanEdit_NoVirtual(can);
	}
	/**
	 * 检测图层是否正在被编辑
	 * @param  
	 * @return 如果图层正在编辑则返回true,反之则否
	 */
	public boolean isEditing()
	{
		return super.isEditing_NoVirtual();
	}
	/**
	 * 设置图层是否正在编辑
	 * @param editing 如果为true,则设置图层正在编辑,反之则否
	 */
	public void setEditing(boolean editing)
	{
		super.setEditing_NoVirtual(editing);
	}
	/**
	 * 检测图层是否可视
	 * @param  
	 * @return 如果图层可视则返回true,反之则否
	 */
	public boolean isVisible()
	{
		return super.isVisible_NoVirtual();
	}
	/**
	 * 设置图层是否可视
	 * @param visible 如果为true,则图层可视,反之则否
	 */
	public void setVisible(boolean visible)
	{
		super.setVisible_NoVirtual(visible);
	}
	/**
	 * 检测图层是否有效
	 * @param  
	 * @return 如果有效则返回true,反之则否
	 */
	public boolean isValid()
	{
		return super.isValid_NoVirtual();
	}
	/**
	 * 判断图层是否支持选择
	 * @param  
	 */
	public boolean isSelectable()
	{
		return super.isSelectable_NoVirtual();
	}
	/**
	 * 设置图层是否支持选择
	 * @param selectable 是否可选
	 */
	public void setSelectable(boolean selectable)
	{
		super.setSelectable_NoVirtual(selectable);
	}
	/**
	 * 检测图层绘制时是否忽略比例尺的因素
	 * @param  
	 * @return 如果忽略,则返回true,反之则否
	 */
	public boolean ignoreScale()
	{
		return super.ignoreScale_NoVirtual();
	}
	/**
	 * 设置图层的绘制是否忽略比例尺的因素
	 * @param bIgnore 是否忽略
	 */
	public void setIgnoreScale(boolean bIgnore)
	{
		super.setIgnoreScale_NoVirtual(bIgnore);
	}
	/**
	 * 获取最大显示比例尺
	 * @param  
	 * @return 比例尺
	 */
	public double getDisplayMaxScale()
	{
		return super.getDisplayMaxScale_NoVirtual();
	}
	/**
	 * 设置最大显示比例尺
	 * @param scale 比例尺
	 */
	public void setDisplayMaxScale(double scale)
	{
		super.setDisplayMaxScale_NoVirtual(scale);
	}
	/**
	 * 获取最小显示比例尺
	 * @param  
	 * @return 比例尺
	 */
	public double getDisplayMinScale()
	{
		return super.getDisplayMinScale_NoVirtual();
	}
	/**
	 * 设置最小显示比例尺
	 * @param scale 比例尺
	 */
	public void setDisplayMinScale(double scale)
	{
		super.setDisplayMinScale_NoVirtual(scale);
	}
	/**
	 * 获取图层的坐标系统
	 * @param  
	 * @return 坐标系统
	 */
	public com.earthview.world.spatial.geometry.Ispatialreference getSpatialReference()
	{
		return super.getSpatialReference_NoVirtual();
	}
	/**
	 * 设置图层的坐标系统
	 * @param sr 坐标系统
	 */
	public void setSpatialReference(com.earthview.world.spatial.geometry.Ispatialreference ref_sr)
	{
		super.setSpatialReference_NoVirtual(ref_sr);
	}
	/**
	 * 设置图层的透明度
	 * @param transparent 透明值
	 */
	public void setTransparentValue(short transparent)
	{
		super.setTransparentValue_NoVirtual(transparent);
	}
	/**
	 * 获取图层的透明值
	 * @param  
	 * @return 透明值
	 */
	public short getTransparentValue()
	{
		return super.getTransparentValue_NoVirtual();
	}
	/**
	 * 获取图层的范围
	 * @param  
	 * @return 图层范围
	 */
	public com.earthview.world.spatial.geometry.Ienvelope getExtent()
	{
		return super.getExtent_NoVirtual();
	}
	/**
	 * 图层的复制,内存外部释放
	 * @param sr 参考坐标系
	 * @return 图层
	 */
	public com.earthview.world.spatial.atlas.Ilayer ev_clone()
	{
		return super.ev_clone_NoVirtual();
	}
	/**
	 * 把图层的信息保存到流中
	 * @param steam 导出流
	 */
	public void toStream(com.earthview.world.core.DataStream stream)
	{
		super.toStream_NoVirtual(stream);
	}
	public String toXML()
	{
		return super.toXML_NoVirtual();
	}
	/**
	 * 从xml中恢复图层的配置
	 * @param element xml要素
	 */
	public void fromXmlElement(com.earthview.world.core.XmlElement element)
	{
		super.fromXmlElement_NoVirtual(element);
	}
	/**
	 * 把图层的信息导出到xml中
	 * @param  
	 * @return xml要素
	 */
	public com.earthview.world.core.XmlElement toXmlElement()
	{
		return super.toXmlElement_NoVirtual();
	}
	public void fromStream(com.earthview.world.core.DataStream stream)
	{
		super.fromStream_NoVirtual(stream);
	}
	
	native protected void register_isSelected_void(long pNativeObject, String method);
	native protected void register_setSelected_ev_bool(long pNativeObject, String method);
	native protected void register_getType_void(long pNativeObject, String method);
	native protected void register_getDataset_void(long pNativeObject, String method);
	native protected void register_getDatasetName_void(long pNativeObject, String method);
	native protected void register_getDataSource_void(long pNativeObject, String method);
	native protected void register_select_IQueryFilter_EVSelectionResultType(long pNativeObject, String method);
	native protected void register_clearSelection_void(long pNativeObject, String method);
	native protected void register_setLayerSelection_ILayerSelection(long pNativeObject, String method);
	native protected void register_getLayerSelection_void(long pNativeObject, String method);
	native protected void register_getName_void(long pNativeObject, String method);
	native protected void register_setName_EVString(long pNativeObject, String method);
	native protected void register_getDescription_void(long pNativeObject, String method);
	native protected void register_setDescription_EVString(long pNativeObject, String method);
	native protected void register_canEdit_void(long pNativeObject, String method);
	native protected void register_setCanEdit_ev_bool(long pNativeObject, String method);
	native protected void register_isEditing_void(long pNativeObject, String method);
	native protected void register_setEditing_ev_bool(long pNativeObject, String method);
	native protected void register_isVisible_void(long pNativeObject, String method);
	native protected void register_setVisible_ev_bool(long pNativeObject, String method);
	native protected void register_isValid_void(long pNativeObject, String method);
	native protected void register_isSelectable_void(long pNativeObject, String method);
	native protected void register_setSelectable_ev_bool(long pNativeObject, String method);
	native protected void register_ignoreScale_void(long pNativeObject, String method);
	native protected void register_setIgnoreScale_ev_bool(long pNativeObject, String method);
	native protected void register_getDisplayMaxScale_void(long pNativeObject, String method);
	native protected void register_setDisplayMaxScale_ev_real64(long pNativeObject, String method);
	native protected void register_getDisplayMinScale_void(long pNativeObject, String method);
	native protected void register_setDisplayMinScale_ev_real64(long pNativeObject, String method);
	native protected void register_getSpatialReference_void(long pNativeObject, String method);
	native protected void register_setSpatialReference_ISpatialReference(long pNativeObject, String method);
	native protected void register_setTransparentValue_ev_uint8(long pNativeObject, String method);
	native protected void register_getTransparentValue_void(long pNativeObject, String method);
	native protected void register_getExtent_void(long pNativeObject, String method);
	native protected void register_draw_ISpatialDisplay_EVVectorLayerRendererType(long pNativeObject, String method);
	native protected void register_ev_clone_void(long pNativeObject, String method);
	native protected void register_toStream_CDataStream(long pNativeObject, String method);
	native protected void register_toXML_void(long pNativeObject, String method);
	native protected void register_fromXmlElement_CXmlElement(long pNativeObject, String method);
	native protected void register_toXmlElement_void(long pNativeObject, String method);
	native protected void register_fromStream_CDataStream(long pNativeObject, String method);
	
	public void registerCallback(){
		if (!this.nativeObject.equals(InstancePointer.ZERO)){
			this.register_isSelected_void(this.nativeObject.pointer, "isSelected_void_callback");
			this.register_setSelected_ev_bool(this.nativeObject.pointer, "setSelected_ev_bool_callback");
			this.register_getType_void(this.nativeObject.pointer, "getType_void_callback");
			this.register_getDataset_void(this.nativeObject.pointer, "getDataset_void_callback");
			this.register_getDatasetName_void(this.nativeObject.pointer, "getDatasetName_void_callback");
			this.register_getDataSource_void(this.nativeObject.pointer, "getDataSource_void_callback");
			this.register_select_IQueryFilter_EVSelectionResultType(this.nativeObject.pointer, "select_IQueryFilter_EVSelectionResultType_callback");
			this.register_clearSelection_void(this.nativeObject.pointer, "clearSelection_void_callback");
			this.register_setLayerSelection_ILayerSelection(this.nativeObject.pointer, "setLayerSelection_ILayerSelection_callback");
			this.register_getLayerSelection_void(this.nativeObject.pointer, "getLayerSelection_void_callback");
			this.register_getName_void(this.nativeObject.pointer, "getName_void_callback");
			this.register_setName_EVString(this.nativeObject.pointer, "setName_EVString_callback");
			this.register_getDescription_void(this.nativeObject.pointer, "getDescription_void_callback");
			this.register_setDescription_EVString(this.nativeObject.pointer, "setDescription_EVString_callback");
			this.register_canEdit_void(this.nativeObject.pointer, "canEdit_void_callback");
			this.register_setCanEdit_ev_bool(this.nativeObject.pointer, "setCanEdit_ev_bool_callback");
			this.register_isEditing_void(this.nativeObject.pointer, "isEditing_void_callback");
			this.register_setEditing_ev_bool(this.nativeObject.pointer, "setEditing_ev_bool_callback");
			this.register_isVisible_void(this.nativeObject.pointer, "isVisible_void_callback");
			this.register_setVisible_ev_bool(this.nativeObject.pointer, "setVisible_ev_bool_callback");
			this.register_isValid_void(this.nativeObject.pointer, "isValid_void_callback");
			this.register_isSelectable_void(this.nativeObject.pointer, "isSelectable_void_callback");
			this.register_setSelectable_ev_bool(this.nativeObject.pointer, "setSelectable_ev_bool_callback");
			this.register_ignoreScale_void(this.nativeObject.pointer, "ignoreScale_void_callback");
			this.register_setIgnoreScale_ev_bool(this.nativeObject.pointer, "setIgnoreScale_ev_bool_callback");
			this.register_getDisplayMaxScale_void(this.nativeObject.pointer, "getDisplayMaxScale_void_callback");
			this.register_setDisplayMaxScale_ev_real64(this.nativeObject.pointer, "setDisplayMaxScale_ev_real64_callback");
			this.register_getDisplayMinScale_void(this.nativeObject.pointer, "getDisplayMinScale_void_callback");
			this.register_setDisplayMinScale_ev_real64(this.nativeObject.pointer, "setDisplayMinScale_ev_real64_callback");
			this.register_getSpatialReference_void(this.nativeObject.pointer, "getSpatialReference_void_callback");
			this.register_setSpatialReference_ISpatialReference(this.nativeObject.pointer, "setSpatialReference_ISpatialReference_callback");
			this.register_setTransparentValue_ev_uint8(this.nativeObject.pointer, "setTransparentValue_ev_uint8_callback");
			this.register_getTransparentValue_void(this.nativeObject.pointer, "getTransparentValue_void_callback");
			this.register_getExtent_void(this.nativeObject.pointer, "getExtent_void_callback");
			this.register_draw_ISpatialDisplay_EVVectorLayerRendererType(this.nativeObject.pointer, "draw_ISpatialDisplay_EVVectorLayerRendererType_callback");
			this.register_ev_clone_void(this.nativeObject.pointer, "ev_clone_void_callback");
			this.register_toStream_CDataStream(this.nativeObject.pointer, "toStream_CDataStream_callback");
			this.register_toXML_void(this.nativeObject.pointer, "toXML_void_callback");
			this.register_fromXmlElement_CXmlElement(this.nativeObject.pointer, "fromXmlElement_CXmlElement_callback");
			this.register_toXmlElement_void(this.nativeObject.pointer, "toXmlElement_void_callback");
			this.register_fromStream_CDataStream(this.nativeObject.pointer, "fromStream_CDataStream_callback");
		}
	}
	
	public static Evwmsmaplayer fromBaseObject(BaseObject baseObj)
	{
		if (baseObj == null || InstancePointer.ZERO.equals(baseObj.nativeObject))
		{
			return null;
		}
		Evwmsmaplayer obj = null;
 		if(baseObj instanceof Evwmsmaplayer)
		{
			obj = (Evwmsmaplayer)baseObj;
		} else {
			obj = new Evwmsmaplayer(CreatedWhenConstruct.CWC_NotToCreate);
			obj.bindNativeObject(baseObj.nativeObject, "CEVWMSMapLayer");
			obj.increaseCast();
		}

		return obj;
	}
}
