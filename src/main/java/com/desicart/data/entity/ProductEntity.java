package com.desicart.data.entity;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Product")
public class ProductEntity //implements Serializable
{
    @Id
    @Field("_id")
    public String id;
    @Field("Handle")
    public String handle;
    @Field("Title")
    public String title;
    @Field("Body (HTML)")
    public String bodyHTML;
    @Field("Vendor")
    public String vendor;
    @Field("Type")
    public String type;
    @Field("Tags")
    public String tags;
    @Field("Published")
    public String published;
    @Field("Option1 Name")
    public String option1Name;
    @Field("Option1 Value")
    public String option1Value;
    @Field("Option2 Name")
    public String option2Name;
    @Field("Option2 Value")
    public String option2Value;
    @Field("Option3 Name")
    public String option3Name;
    @Field("Option3 Value")
    public String option3Value;
    @Field("Variant SKU")
    public String variantSKU;
    @Field("Variant Grams")
    public String variantGrams;
    @Field("Variant Inventory Tracker")
    public String variantInventoryTracker;
    @Field("Variant Inventory Qty")
    public String variantInventoryQty;
    @Field("Variant Inventory Policy")
    public String variantInventoryPolicy;
    @Field("Variant Fulfillment Service")
    public String variantFulfillmentService;
    @Field("Variant Price")
    public String variantPrice;
    @Field("Variant Compare At Price")
    public String variantCompareAtPrice;
    @Field("Variant Requires Shipping")
    public String variantRequiresShipping;
    @Field("Variant Taxable")
    public String variantTaxable;
    @Field("Variant Barcode")
    public String variantBarcode;
    @Field("Image Src")
    public String imageSrc;
    @Field("Image Position")
    public String imagePosition;
    @Field("Image Alt Text")
    public String imageAltText;
    @Field("Gift Card")
    public String giftCard;
    @Field("SEO Title")
    public String sEOTitle;
    @Field("SEO Description")
    public String sEODescription;
    @Field("Google Shopping / Google Product Category")
    public String googleShoppingGoogleProductCategory;
    @Field("Google Shopping / Gender")
    public String googleShoppingGender;
    @Field("Google Shopping / Age Group")
    public String googleShoppingAgeGroup;
    @Field("Google Shopping / MPN")
    public String googleShoppingMPN;
    @Field("Google Shopping / AdWords Grouping")
    public String googleShoppingAdWordsGrouping;
    @Field("Google Shopping / AdWords Labels")
    public String googleShoppingAdWordsLabels;
    @Field("Google Shopping / Condition")
    public String googleShoppingCondition;
    @Field("Google Shopping / Custom Product")
    public String googleShoppingCustomProduct;
    @Field("Google Shopping / Custom Label 0")
    public String googleShoppingCustomLabel0;
    @Field("Google Shopping / Custom Label 1")
    public String googleShoppingCustomLabel1;
    @Field("Google Shopping / Custom Label 2")
    public String googleShoppingCustomLabel2;
    @Field("Google Shopping / Custom Label 3")
    public String googleShoppingCustomLabel3;
    @Field("Google Shopping / Custom Label 4")
    public String googleShoppingCustomLabel4;
    @Field("Variant Image")
    public String variantImage;
    @Field("Variant Weight Unit")
    public String variantWeightUnit;
    @Field("Variant Tax Code")
    public String variantTaxCode;
    @Field("Cost per item")
    public String costPerItem;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5632372996120240031L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ProductEntity() {
    }

    /**
     *
     * @param variantInventoryQty
     * @param costPerItem
     * @param googleShoppingGender
     * @param imageSrc
     * @param title
     * @param type
     * @param variantInventoryPolicy
     * @param googleShoppingMPN
     * @param variantWeightUnit
     * @param option1Name
     * @param googleShoppingAdWordsGrouping
     * @param vendor
     * @param googleShoppingAgeGroup
     * @param variantBarcode
     * @param variantPrice
     * @param id
     * @param option3Value
     * @param option2Name
     * @param variantSKU
     * @param imageAltText
     * @param variantCompareAtPrice
     * @param googleShoppingCustomProduct
     * @param imagePosition
     * @param variantTaxable
     * @param variantGrams
     * @param handle
     * @param variantTaxCode
     * @param published
     * @param option3Name
     * @param variantFulfillmentService
     * @param option2Value
     * @param sEOTitle
     * @param googleShoppingCustomLabel0
     * @param tags
     * @param googleShoppingCustomLabel1
     * @param variantImage
     * @param googleShoppingCustomLabel2
     * @param option1Value
     * @param variantRequiresShipping
     * @param googleShoppingCustomLabel3
     * @param googleShoppingCustomLabel4
     * @param googleShoppingAdWordsLabels
     * @param googleShoppingCondition
     * @param variantInventoryTracker
     * @param giftCard
     * @param googleShoppingGoogleProductCategory
     * @param bodyHTML
     * @param sEODescription
     */
    public ProductEntity(String id, String handle, String title, String bodyHTML, String vendor, String type, String tags, String published, String option1Name, String option1Value, String option2Name, String option2Value, String option3Name, String option3Value, String variantSKU, String variantGrams, String variantInventoryTracker, String variantInventoryQty, String variantInventoryPolicy, String variantFulfillmentService, String variantPrice, String variantCompareAtPrice, String variantRequiresShipping, String variantTaxable, String variantBarcode, String imageSrc, String imagePosition, String imageAltText, String giftCard, String sEOTitle, String sEODescription, String googleShoppingGoogleProductCategory, String googleShoppingGender, String googleShoppingAgeGroup, String googleShoppingMPN, String googleShoppingAdWordsGrouping, String googleShoppingAdWordsLabels, String googleShoppingCondition, String googleShoppingCustomProduct, String googleShoppingCustomLabel0, String googleShoppingCustomLabel1, String googleShoppingCustomLabel2, String googleShoppingCustomLabel3, String googleShoppingCustomLabel4, String variantImage, String variantWeightUnit, String variantTaxCode, String costPerItem) {
        super();
        this.id = id;
        this.handle = handle;
        this.title = title;
        this.bodyHTML = bodyHTML;
        this.vendor = vendor;
        this.type = type;
        this.tags = tags;
        this.published = published;
        this.option1Name = option1Name;
        this.option1Value = option1Value;
        this.option2Name = option2Name;
        this.option2Value = option2Value;
        this.option3Name = option3Name;
        this.option3Value = option3Value;
        this.variantSKU = variantSKU;
        this.variantGrams = variantGrams;
        this.variantInventoryTracker = variantInventoryTracker;
        this.variantInventoryQty = variantInventoryQty;
        this.variantInventoryPolicy = variantInventoryPolicy;
        this.variantFulfillmentService = variantFulfillmentService;
        this.variantPrice = variantPrice;
        this.variantCompareAtPrice = variantCompareAtPrice;
        this.variantRequiresShipping = variantRequiresShipping;
        this.variantTaxable = variantTaxable;
        this.variantBarcode = variantBarcode;
        this.imageSrc = imageSrc;
        this.imagePosition = imagePosition;
        this.imageAltText = imageAltText;
        this.giftCard = giftCard;
        this.sEOTitle = sEOTitle;
        this.sEODescription = sEODescription;
        this.googleShoppingGoogleProductCategory = googleShoppingGoogleProductCategory;
        this.googleShoppingGender = googleShoppingGender;
        this.googleShoppingAgeGroup = googleShoppingAgeGroup;
        this.googleShoppingMPN = googleShoppingMPN;
        this.googleShoppingAdWordsGrouping = googleShoppingAdWordsGrouping;
        this.googleShoppingAdWordsLabels = googleShoppingAdWordsLabels;
        this.googleShoppingCondition = googleShoppingCondition;
        this.googleShoppingCustomProduct = googleShoppingCustomProduct;
        this.googleShoppingCustomLabel0 = googleShoppingCustomLabel0;
        this.googleShoppingCustomLabel1 = googleShoppingCustomLabel1;
        this.googleShoppingCustomLabel2 = googleShoppingCustomLabel2;
        this.googleShoppingCustomLabel3 = googleShoppingCustomLabel3;
        this.googleShoppingCustomLabel4 = googleShoppingCustomLabel4;
        this.variantImage = variantImage;
        this.variantWeightUnit = variantWeightUnit;
        this.variantTaxCode = variantTaxCode;
        this.costPerItem = costPerItem;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("handle", handle).append("title", title).append("bodyHTML", bodyHTML).append("vendor", vendor).append("type", type).append("tags", tags).append("published", published).append("option1Name", option1Name).append("option1Value", option1Value).append("option2Name", option2Name).append("option2Value", option2Value).append("option3Name", option3Name).append("option3Value", option3Value).append("variantSKU", variantSKU).append("variantGrams", variantGrams).append("variantInventoryTracker", variantInventoryTracker).append("variantInventoryQty", variantInventoryQty).append("variantInventoryPolicy", variantInventoryPolicy).append("variantFulfillmentService", variantFulfillmentService).append("variantPrice", variantPrice).append("variantCompareAtPrice", variantCompareAtPrice).append("variantRequiresShipping", variantRequiresShipping).append("variantTaxable", variantTaxable).append("variantBarcode", variantBarcode).append("imageSrc", imageSrc).append("imagePosition", imagePosition).append("imageAltText", imageAltText).append("giftCard", giftCard).append("sEOTitle", sEOTitle).append("sEODescription", sEODescription).append("googleShoppingGoogleProductCategory", googleShoppingGoogleProductCategory).append("googleShoppingGender", googleShoppingGender).append("googleShoppingAgeGroup", googleShoppingAgeGroup).append("googleShoppingMPN", googleShoppingMPN).append("googleShoppingAdWordsGrouping", googleShoppingAdWordsGrouping).append("googleShoppingAdWordsLabels", googleShoppingAdWordsLabels).append("googleShoppingCondition", googleShoppingCondition).append("googleShoppingCustomProduct", googleShoppingCustomProduct).append("googleShoppingCustomLabel0", googleShoppingCustomLabel0).append("googleShoppingCustomLabel1", googleShoppingCustomLabel1).append("googleShoppingCustomLabel2", googleShoppingCustomLabel2).append("googleShoppingCustomLabel3", googleShoppingCustomLabel3).append("googleShoppingCustomLabel4", googleShoppingCustomLabel4).append("variantImage", variantImage).append("variantWeightUnit", variantWeightUnit).append("variantTaxCode", variantTaxCode).append("costPerItem", costPerItem).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(variantInventoryQty).append(costPerItem).append(googleShoppingGender).append(type).append(variantInventoryPolicy).append(googleShoppingMPN).append(option1Name).append(googleShoppingAgeGroup).append(id).append(option2Name).append(variantSKU).append(imageAltText).append(variantCompareAtPrice).append(imagePosition).append(variantTaxable).append(handle).append(variantTaxCode).append(published).append(option3Name).append(variantFulfillmentService).append(option2Value).append(sEOTitle).append(googleShoppingCustomLabel0).append(tags).append(googleShoppingCustomLabel1).append(googleShoppingCustomLabel2).append(googleShoppingCustomLabel3).append(googleShoppingCustomLabel4).append(googleShoppingAdWordsLabels).append(googleShoppingCondition).append(variantInventoryTracker).append(googleShoppingGoogleProductCategory).append(bodyHTML).append(additionalProperties).append(sEODescription).append(imageSrc).append(title).append(variantWeightUnit).append(googleShoppingAdWordsGrouping).append(vendor).append(variantBarcode).append(variantPrice).append(option3Value).append(googleShoppingCustomProduct).append(variantGrams).append(variantImage).append(option1Value).append(variantRequiresShipping).append(giftCard).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductEntity) == false) {
            return false;
        }
        ProductEntity rhs = ((ProductEntity) other);
        return new EqualsBuilder().append(variantInventoryQty, rhs.variantInventoryQty).append(costPerItem, rhs.costPerItem).append(googleShoppingGender, rhs.googleShoppingGender).append(type, rhs.type).append(variantInventoryPolicy, rhs.variantInventoryPolicy).append(googleShoppingMPN, rhs.googleShoppingMPN).append(option1Name, rhs.option1Name).append(googleShoppingAgeGroup, rhs.googleShoppingAgeGroup).append(id, rhs.id).append(option2Name, rhs.option2Name).append(variantSKU, rhs.variantSKU).append(imageAltText, rhs.imageAltText).append(variantCompareAtPrice, rhs.variantCompareAtPrice).append(imagePosition, rhs.imagePosition).append(variantTaxable, rhs.variantTaxable).append(handle, rhs.handle).append(variantTaxCode, rhs.variantTaxCode).append(published, rhs.published).append(option3Name, rhs.option3Name).append(variantFulfillmentService, rhs.variantFulfillmentService).append(option2Value, rhs.option2Value).append(sEOTitle, rhs.sEOTitle).append(googleShoppingCustomLabel0, rhs.googleShoppingCustomLabel0).append(tags, rhs.tags).append(googleShoppingCustomLabel1, rhs.googleShoppingCustomLabel1).append(googleShoppingCustomLabel2, rhs.googleShoppingCustomLabel2).append(googleShoppingCustomLabel3, rhs.googleShoppingCustomLabel3).append(googleShoppingCustomLabel4, rhs.googleShoppingCustomLabel4).append(googleShoppingAdWordsLabels, rhs.googleShoppingAdWordsLabels).append(googleShoppingCondition, rhs.googleShoppingCondition).append(variantInventoryTracker, rhs.variantInventoryTracker).append(googleShoppingGoogleProductCategory, rhs.googleShoppingGoogleProductCategory).append(bodyHTML, rhs.bodyHTML).append(additionalProperties, rhs.additionalProperties).append(sEODescription, rhs.sEODescription).append(imageSrc, rhs.imageSrc).append(title, rhs.title).append(variantWeightUnit, rhs.variantWeightUnit).append(googleShoppingAdWordsGrouping, rhs.googleShoppingAdWordsGrouping).append(vendor, rhs.vendor).append(variantBarcode, rhs.variantBarcode).append(variantPrice, rhs.variantPrice).append(option3Value, rhs.option3Value).append(googleShoppingCustomProduct, rhs.googleShoppingCustomProduct).append(variantGrams, rhs.variantGrams).append(variantImage, rhs.variantImage).append(option1Value, rhs.option1Value).append(variantRequiresShipping, rhs.variantRequiresShipping).append(giftCard, rhs.giftCard).isEquals();
    }

}