﻿#ifndef _LASCONVERTPROXY_COFING_H
#define _LASCONVERTPROXY_COFING_H
#include "core/global.h"

#ifdef  EV_BUILD_LASCONVERTROXY_MANAGER 
#define EV_LASCONVERTPROXY_DLL EV_DLL_EXPORT
#else
#define EV_LASCONVERTPROXY_DLL EV_DLL_IMPORT
#endif

#endif
