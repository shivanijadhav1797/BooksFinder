package com.books.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Items
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-29T11:16:10.424Z[GMT]")


public class Items   {
  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("etag")
  private String etag = null;

  @JsonProperty("selfLink")
  private String selfLink = null;

  @JsonProperty("volumeInfo")
  private VolumeInfo volumeInfo = null;

  public Items kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(value = "")
  
    public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Items id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Items etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Get etag
   * @return etag
  **/
  @ApiModelProperty(value = "")
  
    public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public Items selfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Get selfLink
   * @return selfLink
  **/
  @ApiModelProperty(value = "")
  
    public String getSelfLink() {
    return selfLink;
  }

  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }

  public Items volumeInfo(VolumeInfo volumeInfo) {
    this.volumeInfo = volumeInfo;
    return this;
  }

  /**
   * Get volumeInfo
   * @return volumeInfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public VolumeInfo getVolumeInfo() {
    return volumeInfo;
  }

  public void setVolumeInfo(VolumeInfo volumeInfo) {
    this.volumeInfo = volumeInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Items items = (Items) o;
    return Objects.equals(this.kind, items.kind) &&
        Objects.equals(this.id, items.id) &&
        Objects.equals(this.etag, items.etag) &&
        Objects.equals(this.selfLink, items.selfLink) &&
        Objects.equals(this.volumeInfo, items.volumeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, etag, selfLink, volumeInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Items {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
    sb.append("    volumeInfo: ").append(toIndentedString(volumeInfo)).append("\n");
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
