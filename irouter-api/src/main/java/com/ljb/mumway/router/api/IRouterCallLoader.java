package com.ljb.mumway.router.api;


import java.util.Map;

public interface IRouterCallLoader {

    Map<String, IRouterCall>  loadInfo();
}
