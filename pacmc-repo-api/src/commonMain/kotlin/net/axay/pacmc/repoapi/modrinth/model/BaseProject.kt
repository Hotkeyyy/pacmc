/**
 * Labrinth
 *
 * This API is documented in the **OpenAPI format** and is available for download [here](/openapi.yaml).  There are some undocumented routes. These routes are not meant for public use, such as the routes for adding new items to tags.  ## Cross-Origin Resource Sharing This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with the [W3C spec](https://www.w3.org/TR/cors/). This allows for cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site.  ## Authentication This API uses GitHub tokens for authentication. The token is in the `Authorization` header of the request. You can get a token [here](#operation/initAuth).    Example:  ```  Authorization: gho_pJ9dGXVKpfzZp4PUHSxYEq9hjk0h288Gwj4S  ```  ## Ratelimits The API has a ratelimit defined per IP. Limits and remaining amounts are given in the response headers. The `X-Ratelimit-Limit` header is the maximum number of requests that can be made in a minute. The `X-Ratelimit-Remaining` header is the number of requests remaining in the current ratelimit window. The `X-Ratelimit-Reset` header is the time in seconds until the ratelimit window resets. 
 *
 * The version of the OpenAPI document: f3234a6 (v2)
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package net.axay.pacmc.repoapi.modrinth.model


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param title The title or name of the project
 * @param description A short description of the project
 * @param categories A list of the categories that the project is in
 * @param clientSide The client side support of the project
 * @param serverSide The server side support of the project
 * @param slug The slug of a project, used for vanity URLs
 */
@Serializable
data class BaseProject (

    /* The title or name of the project */
    @SerialName(value = "title") @Required val title: kotlin.String,

    /* A short description of the project */
    @SerialName(value = "description") @Required val description: kotlin.String,

    /* A list of the categories that the project is in */
    @SerialName(value = "categories") @Required val categories: kotlin.collections.List<kotlin.String>,

    /* The client side support of the project */
    @SerialName(value = "client_side") @Required val clientSide: BaseProject.ClientSide,

    /* The server side support of the project */
    @SerialName(value = "server_side") @Required val serverSide: BaseProject.ServerSide,

    /* The slug of a project, used for vanity URLs */
    @SerialName(value = "slug") val slug: kotlin.String? = null

) {

    /**
     * The client side support of the project
     *
     * Values: required,optional,unsupported
     */
    @Serializable
    enum class ClientSide(val value: kotlin.String) {
        @SerialName(value = "required") required("required"),
        @SerialName(value = "optional") optional("optional"),
        @SerialName(value = "unsupported") unsupported("unsupported");
    }
    /**
     * The server side support of the project
     *
     * Values: required,optional,unsupported
     */
    @Serializable
    enum class ServerSide(val value: kotlin.String) {
        @SerialName(value = "required") required("required"),
        @SerialName(value = "optional") optional("optional"),
        @SerialName(value = "unsupported") unsupported("unsupported");
    }
}

