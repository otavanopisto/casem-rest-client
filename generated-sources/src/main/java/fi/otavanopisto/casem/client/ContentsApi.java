/**
 * CaseM client
 * Automatically generated client libraries for CaseM
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fi.otavanopisto.casem.client;

import fi.otavanopisto.casem.client.model.*;

import fi.otavanopisto.casem.client.model.Content;
import fi.otavanopisto.casem.client.model.Error;
import fi.otavanopisto.casem.client.model.ContentList;
import fi.otavanopisto.casem.client.model.ExtendedPropertyList;
import fi.otavanopisto.casem.client.model.FileList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-26T06:14:28.404+03:00")
public class ContentsApi {

  private ApiClient client;
  private String baseUrl;

  public ContentsApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * Finds content with contentId
   * Finds content with contentId
   * @param contentId Content id (required)
   */
  public ApiResponse<Content> findContent(Long contentId) {
    Map<String, Object> queryParams = new HashMap<>();
        
    String path = String.format("%s//Contents({contentId})"
      .replaceAll("\\{" + "contentId" + "\\}", String.valueOf(contentId)), baseUrl);
      
    ResultType<Content> resultType = new ResultType<Content>() {};
    return client.doGETRequest(path, resultType, queryParams);
  }
  /**
   * List contents
   * List contents
   * @param skiptoken Skip until this id (optional)
   */
  public ApiResponse<ContentList> listContents(String skiptoken) {
    Map<String, Object> queryParams = new HashMap<>();
    if (skiptoken != null)
    queryParams.put("$skiptoken", skiptoken);
    
    String path = String.format("%s//Contents", baseUrl);
      
    ResultType<ContentList> resultType = new ResultType<ContentList>() {};
    return client.doGETRequest(path, resultType, queryParams);
  }
  /**
   * Lists extended properties by contentId
   * Lists extended properties by contentId
   * @param contentId Content id (required)
   * @param skiptoken Skip until this id (optional)
   */
  public ApiResponse<ExtendedPropertyList> listExtendedPropertiesByContent(Long contentId, String skiptoken) {
    Map<String, Object> queryParams = new HashMap<>();
    if (skiptoken != null)
    queryParams.put("$skiptoken", skiptoken);
    
    String path = String.format("%s//Contents({contentId})/ExtendedProperties"
      .replaceAll("\\{" + "contentId" + "\\}", String.valueOf(contentId)), baseUrl);
      
    ResultType<ExtendedPropertyList> resultType = new ResultType<ExtendedPropertyList>() {};
    return client.doGETRequest(path, resultType, queryParams);
  }
  /**
   * Lists files by contentId
   * Lists files by contentId
   * @param contentId Content id (required)
   * @param skiptoken Skip until this id (optional)
   */
  public ApiResponse<FileList> listFilesByContent(Long contentId, String skiptoken) {
    Map<String, Object> queryParams = new HashMap<>();
    if (skiptoken != null)
    queryParams.put("$skiptoken", skiptoken);
    
    String path = String.format("%s//Contents({contentId})/Files"
      .replaceAll("\\{" + "contentId" + "\\}", String.valueOf(contentId)), baseUrl);
      
    ResultType<FileList> resultType = new ResultType<FileList>() {};
    return client.doGETRequest(path, resultType, queryParams);
  }
  
}
