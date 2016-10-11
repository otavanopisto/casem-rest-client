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

import fi.otavanopisto.casem.client.model.Error;
import fi.otavanopisto.casem.client.model.ContentLanguage;
import fi.otavanopisto.casem.client.model.ContentLanguageList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-11T06:32:12.166+03:00")
public class ContentLanguagesApi {

  private ApiClient client;
  private String baseUrl;

  public ContentLanguagesApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * Finds contentLanguage with contentLanguageId
   * Finds contentLanguage with contentLanguageId
   * @param contentLanguageId ContentLanguage id (required)
   */
  public ApiResponse<ContentLanguage> findContentLanguage(Long contentLanguageId) {
    Map<String, Object> queryParams = new HashMap<>();
        
    String path = String.format("%s//ContentLanguages({contentLanguageId})"
      .replaceAll("\\{" + "contentLanguageId" + "\\}", String.valueOf(contentLanguageId)), baseUrl);
      
    ResultType<ContentLanguage> resultType = new ResultType<ContentLanguage>() {};
    return client.doGETRequest(path, resultType, queryParams);
  }
  /**
   * List contentLanguages
   * List contentLanguages
   * @param skiptoken Skip until this id (optional)
   */
  public ApiResponse<ContentLanguageList> listContentLanguages(String skiptoken) {
    Map<String, Object> queryParams = new HashMap<>();
    if (skiptoken != null)
    queryParams.put("$skiptoken", skiptoken);
    
    String path = String.format("%s//ContentLanguages", baseUrl);
      
    ResultType<ContentLanguageList> resultType = new ResultType<ContentLanguageList>() {};
    return client.doGETRequest(path, resultType, queryParams);
  }
  
}
