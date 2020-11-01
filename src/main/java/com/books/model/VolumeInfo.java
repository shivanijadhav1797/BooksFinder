package com.books.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * VolumeInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-29T15:14:08.989Z[GMT]")


public class VolumeInfo   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("subtitle")
  private String subtitle = null;

  @JsonProperty("authors")
  @Valid
  private List<String> authors = null;

  @JsonProperty("averageRating")
  private Integer averageRating = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("pageCount")
  private Integer pageCount = null;

  @JsonProperty("printType")
  private String printType = null;

  @JsonProperty("publisher")
  private String publisher = null;

  @JsonProperty("publishedDate")
  private String publishedDate = null;

  @JsonProperty("previewLink")
  private String previewLink = null;

  @JsonProperty("imageLinks")
  private ImageLinks imageLinks = null;

  public VolumeInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public VolumeInfo subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  /**
   * Get subtitle
   * @return subtitle
  **/
  @ApiModelProperty(value = "")
  
    public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public VolumeInfo authors(List<String> authors) {
    this.authors = authors;
    return this;
  }

  public VolumeInfo addAuthorsItem(String authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<String>();
    }
    this.authors.add(authorsItem);
    return this;
  }

  /**
   * Get authors
   * @return authors
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getAuthors() {
    return authors;
  }

  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }

  public VolumeInfo averageRating(Integer averageRating) {
    this.averageRating = averageRating;
    return this;
  }

  /**
   * Get averageRating
   * @return averageRating
  **/
  @ApiModelProperty(value = "")
  
    public Integer getAverageRating() {
    return averageRating;
  }

  public void setAverageRating(Integer averageRating) {
    this.averageRating = averageRating;
  }

  public VolumeInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VolumeInfo language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(value = "")
  
    public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public VolumeInfo pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

  /**
   * Get pageCount
   * @return pageCount
  **/
  @ApiModelProperty(value = "")
  
    public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public VolumeInfo printType(String printType) {
    this.printType = printType;
    return this;
  }

  /**
   * Get printType
   * @return printType
  **/
  @ApiModelProperty(value = "")
  
    public String getPrintType() {
    return printType;
  }

  public void setPrintType(String printType) {
    this.printType = printType;
  }

  public VolumeInfo publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

  /**
   * Get publisher
   * @return publisher
  **/
  @ApiModelProperty(value = "")
  
    public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public VolumeInfo publishedDate(String publishedDate) {
    this.publishedDate = publishedDate;
    return this;
  }

  /**
   * Get publishedDate
   * @return publishedDate
  **/
  @ApiModelProperty(value = "")
  
    public String getPublishedDate() {
    return publishedDate;
  }

  public void setPublishedDate(String publishedDate) {
    this.publishedDate = publishedDate;
  }

  public VolumeInfo previewLink(String previewLink) {
    this.previewLink = previewLink;
    return this;
  }

  /**
   * Get previewLink
   * @return previewLink
  **/
  @ApiModelProperty(value = "")
  
    public String getPreviewLink() {
    return previewLink;
  }

  public void setPreviewLink(String previewLink) {
    this.previewLink = previewLink;
  }

  public VolumeInfo imageLinks(ImageLinks imageLinks) {
    this.imageLinks = imageLinks;
    return this;
  }

  /**
   * Get imageLinks
   * @return imageLinks
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ImageLinks getImageLinks() {
    return imageLinks;
  }

  public void setImageLinks(ImageLinks imageLinks) {
    this.imageLinks = imageLinks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeInfo volumeInfo = (VolumeInfo) o;
    return Objects.equals(this.title, volumeInfo.title) &&
        Objects.equals(this.subtitle, volumeInfo.subtitle) &&
        Objects.equals(this.authors, volumeInfo.authors) &&
        Objects.equals(this.averageRating, volumeInfo.averageRating) &&
        Objects.equals(this.description, volumeInfo.description) &&
        Objects.equals(this.language, volumeInfo.language) &&
        Objects.equals(this.pageCount, volumeInfo.pageCount) &&
        Objects.equals(this.printType, volumeInfo.printType) &&
        Objects.equals(this.publisher, volumeInfo.publisher) &&
        Objects.equals(this.publishedDate, volumeInfo.publishedDate) &&
        Objects.equals(this.previewLink, volumeInfo.previewLink) &&
        Objects.equals(this.imageLinks, volumeInfo.imageLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, subtitle, authors, averageRating, description, language, pageCount, printType, publisher, publishedDate, previewLink, imageLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeInfo {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    averageRating: ").append(toIndentedString(averageRating)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    printType: ").append(toIndentedString(printType)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    publishedDate: ").append(toIndentedString(publishedDate)).append("\n");
    sb.append("    previewLink: ").append(toIndentedString(previewLink)).append("\n");
    sb.append("    imageLinks: ").append(toIndentedString(imageLinks)).append("\n");
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
