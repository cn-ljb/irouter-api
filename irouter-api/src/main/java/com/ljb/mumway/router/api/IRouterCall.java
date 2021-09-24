package com.ljb.mumway.router.api;

import android.content.Context;
import android.os.Bundle;

public interface IRouterCall {

    String handleRouter(Context context, String path, Bundle bundle);
}