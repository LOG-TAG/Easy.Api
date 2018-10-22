package com.hlabexmaples.easyapi.data.webservice;

import com.hlabexmaples.easyapi.data.models.Base;
import com.hlabexmaples.easyapi.data.models.Envelop;
import com.hlabexmaples.easyapi.data.models.User;
import io.reactivex.Observable;
import java.util.List;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Retrofit callback methods.
 */

public interface ApiRepository {

  @GET(Constants.WS_METHOD_USERS)
  Call<RequestBody> fetchMe();

  @GET(Constants.WS_METHOD_USERS)
  Call<Envelop<List<User>>> fetchUsers(@Query(Constants.PARAM_PAGE) String page);

  @GET(Constants.WS_METHOD_USERS)
  Observable<Envelop<List<User>>> fetchUsersWithRx(@Query(Constants.PARAM_PAGE) String page);

  /*Example with Base class*/
  @GET(Constants.WS_METHOD_USERS)
  Observable<Base<List<User>>> fetchUsersBase(@Query(Constants.PARAM_PAGE) String page);
}
