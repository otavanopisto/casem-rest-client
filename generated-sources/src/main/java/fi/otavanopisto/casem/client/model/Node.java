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


package fi.otavanopisto.casem.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fi.otavanopisto.casem.client.model.NodeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Node
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-11T06:32:12.166+03:00")
public class Node   {
  @JsonProperty("odata.metadata")
  private String odataMetadata = null;

  @JsonProperty("NodeId")
  private Long nodeId = null;

  @JsonProperty("ParentId")
  private Long parentId = null;

  @JsonProperty("Names")
  private List<NodeName> names = new ArrayList<NodeName>();

  @JsonProperty("SortOrder")
  private Integer sortOrder = null;

  @JsonProperty("Date")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime date = null;

  @JsonProperty("Type")
  private Long type = null;

  public Node odataMetadata(String odataMetadata) {
    this.odataMetadata = odataMetadata;
    return this;
  }

   /**
   * Get odataMetadata
   * @return odataMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOdataMetadata() {
    return odataMetadata;
  }

  public void setOdataMetadata(String odataMetadata) {
    this.odataMetadata = odataMetadata;
  }

  public Node nodeId(Long nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getNodeId() {
    return nodeId;
  }

  public void setNodeId(Long nodeId) {
    this.nodeId = nodeId;
  }

  public Node parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public Node names(List<NodeName> names) {
    this.names = names;
    return this;
  }

  public Node addNamesItem(NodeName namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<NodeName> getNames() {
    return names;
  }

  public void setNames(List<NodeName> names) {
    this.names = names;
  }

  public Node sortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public Node date(LocalDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public Node type(Long type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(this.odataMetadata, node.odataMetadata) &&
        Objects.equals(this.nodeId, node.nodeId) &&
        Objects.equals(this.parentId, node.parentId) &&
        Objects.equals(this.names, node.names) &&
        Objects.equals(this.sortOrder, node.sortOrder) &&
        Objects.equals(this.date, node.date) &&
        Objects.equals(this.type, node.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataMetadata, nodeId, parentId, names, sortOrder, date, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    
    sb.append("    odataMetadata: ").append(toIndentedString(odataMetadata)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

