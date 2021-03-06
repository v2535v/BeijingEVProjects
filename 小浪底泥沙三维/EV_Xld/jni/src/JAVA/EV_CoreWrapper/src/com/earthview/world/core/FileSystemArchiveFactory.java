package com.earthview.world.core;

import global.*;
import com.earthview.world.base.*;
import com.earthview.world.util.*;

////class EV_GRAPHIC_PRIVATE CFileSystemArchiveFactory : public EarthView::World::Core::CArchiveFactory
public class FileSystemArchiveFactory extends com.earthview.world.core.ArchiveFactory {
	
	static {
		GlobalClassFactoryMap.put("EarthView::World::Core::CFileSystemArchiveFactory", new FileSystemArchiveFactoryClassFactory());
		GlobalClassFactoryMap.put("EarthView::World::Core::JCFileSystemArchiveFactoryProxy", new FileSystemArchiveFactoryClassFactory());
	}

	public FileSystemArchiveFactory() {
		super(CreatedWhenConstruct.CWC_NotToCreate);
		Create("JCFileSystemArchiveFactoryProxy", null, true);
		this.registerCallback();
		if (!"com.earthview.world.core.FileSystemArchiveFactory".equals(this.getClass().getName()))
		{
			this.setCustomExtend(true);
		}
	}

	native private String getType_void(long pNativeObject);
	//// @copydoc FactoryObj::getType
	public String getType()
	{
		String returnValue = getType_void(this.nativeObject.pointer);
		return returnValue;
	}
	native private String getType_void_NoVirtual(long pNativeObject);
	protected String getType_NoVirtual()
	{
		String returnValue = getType_void_NoVirtual(this.nativeObject.pointer);
		return returnValue;
	}

	native private long createInstance_EVString(long pNativeObject, String name);
	//// @copydoc FactoryObj::createInstance
	public com.earthview.world.core.Archive createInstance(String name)
	{
		String nameParamValue = name;
		long returnValue = createInstance_EVString(this.nativeObject.pointer, nameParamValue);
		if(returnValue == 0L) {
			return null;
		}
		com.earthview.world.core.Archive __returnValue = new com.earthview.world.core.Archive(CreatedWhenConstruct.CWC_NotToCreate, "CArchive");
		__returnValue.setDelegate(true);
		InstancePointer __instancePointer = new InstancePointer(returnValue);
		__returnValue.setInstancePointer(__instancePointer);
		IClassFactory __returnValueClassFactory = GlobalClassFactoryMap.get(__returnValue.getCppInstanceTypeName());
		if (__returnValueClassFactory != null)
		{
			__returnValue.setDelegate(true);
			__returnValue = (com.earthview.world.core.Archive)__returnValueClassFactory.create();
			__returnValue.setDelegate(true);
			__returnValue.bindNativeObject(__instancePointer, "CArchive");
		}
		return __returnValue;
	}
	native private long createInstance_EVString_NoVirtual(long pNativeObject, String name);
	protected com.earthview.world.core.Archive createInstance_NoVirtual(String name)
	{
		String nameParamValue = name;
		long returnValue = createInstance_EVString_NoVirtual(this.nativeObject.pointer, nameParamValue);
		if(returnValue == 0L) {
			return null;
		}
		com.earthview.world.core.Archive __returnValue = new com.earthview.world.core.Archive(CreatedWhenConstruct.CWC_NotToCreate, "CArchive");
		__returnValue.setDelegate(true);
		InstancePointer __instancePointer = new InstancePointer(returnValue);
		__returnValue.setInstancePointer(__instancePointer);
		IClassFactory __returnValueClassFactory = GlobalClassFactoryMap.get(__returnValue.getCppInstanceTypeName());
		if (__returnValueClassFactory != null)
		{
			__returnValue.setDelegate(true);
			__returnValue = (com.earthview.world.core.Archive)__returnValueClassFactory.create();
			__returnValue.setDelegate(true);
			__returnValue.bindNativeObject(__instancePointer, "CArchive");
		}
		return __returnValue;
	}

	native private void destroyInstance_CArchive(long pNativeObject, long arch);
	//// @copydoc FactoryObj::destroyInstance
	public void destroyInstance(com.earthview.world.core.Archive arch)
	{
		long archParamValue = (arch == null ? 0L : arch.nativeObject.pointer);
		destroyInstance_CArchive(this.nativeObject.pointer, archParamValue);
	}
	native private void destroyInstance_CArchive_NoVirtual(long pNativeObject, long arch);
	protected void destroyInstance_NoVirtual(com.earthview.world.core.Archive arch)
	{
		long archParamValue = (arch == null ? 0L : arch.nativeObject.pointer);
		destroyInstance_CArchive_NoVirtual(this.nativeObject.pointer, archParamValue);
	}

	public FileSystemArchiveFactory(CreatedWhenConstruct cwc) {
		super(CreatedWhenConstruct.CWC_NotToCreate);
	}
	public FileSystemArchiveFactory(CreatedWhenConstruct cwc, String classNameStr) {
		super(CreatedWhenConstruct.CWC_NotToCreate, classNameStr);
	}
	
	
	native protected void register_getType_void(long pNativeObject, String method);
	native protected void register_createInstance_EVString(long pNativeObject, String method);
	native protected void register_destroyInstance_CArchive(long pNativeObject, String method);
	
	public void registerCallback(){
		if (!this.nativeObject.equals(InstancePointer.ZERO)){
			this.register_getType_void(this.nativeObject.pointer, "getType_void_callback");
			this.register_createInstance_EVString(this.nativeObject.pointer, "createInstance_EVString_callback");
			this.register_destroyInstance_CArchive(this.nativeObject.pointer, "destroyInstance_CArchive_callback");
		}
	}
	
	public static FileSystemArchiveFactory fromBaseObject(BaseObject baseObj)
	{
		if (baseObj == null || InstancePointer.ZERO.equals(baseObj.nativeObject))
		{
			return null;
		}
		FileSystemArchiveFactory obj = null;
 		if(baseObj instanceof FileSystemArchiveFactory)
		{
			obj = (FileSystemArchiveFactory)baseObj;
		} else {
			obj = new FileSystemArchiveFactory(CreatedWhenConstruct.CWC_NotToCreate);
			obj.bindNativeObject(baseObj.nativeObject, "CFileSystemArchiveFactory");
			obj.increaseCast();
		}

		return obj;
	}
}
