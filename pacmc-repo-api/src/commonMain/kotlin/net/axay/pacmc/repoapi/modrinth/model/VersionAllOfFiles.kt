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

import net.axay.pacmc.repoapi.modrinth.model.VersionAllOfHashes

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param hashes 
 * @param url A direct link to the file
 * @param filename The name of the file
 * @param primary 
 */
@Serializable
data class VersionAllOfFiles (

    @SerialName(value = "hashes") @Required val hashes: VersionAllOfHashes,

    /* A direct link to the file */
    @SerialName(value = "url") @Required val url: kotlin.String,

    /* The name of the file */
    @SerialName(value = "filename") @Required val filename: kotlin.String,

    @SerialName(value = "primary") @Required val primary: kotlin.Boolean

)

