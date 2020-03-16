package fahmy.smartplaces.repository

import fahmy.smartplaces.enitities.PlacesResponse
import retrofit2.Response


/**
 * Created by mohamed abd elnaby on 16/April/2019
 */

class RepositoryClient {
    var endPoint: EndPoint = BaseClientApi.getRetrofitClient().create(EndPoint::class.java)


    companion object {
        var repositoryClient = RepositoryClient()
    }

    suspend fun fetchPlaces(apiKey: String, location: String): Response<PlacesResponse> {
        return endPoint.fetchPlaces(apiKey, location, "500")
    }

}