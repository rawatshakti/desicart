package com.desicart.data.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product
{
    @Id
    @Field("_id")
    private String id;
    @Field("Handle")
    private String handle;
    @Field("Title")
    private String title;
    @Field("Body (HTML)")
    private String bodyHTML;
    @Field("Vendor")
    private String vendor;
    @Field("Type")
    private String type;
    @Field("Tags")
    private String tags;
    @Field("Published")
    private String published;
    @Field("Option1 Name")
    private String option1Name;
    @Field("Option1 Value")
    private String option1Value;
    @Field("Option2 Name")
    private String option2Name;
    @Field("Option2 Value")
    private String option2Value;
    @Field("Option3 Name")
    private String option3Name;
    @Field("Option3 Value")
    private String option3Value;
    @Field("Variant SKU")
    private String variantSKU;
    @Field("Variant Grams")
    private String variantGrams;
    @Field("Variant Inventory Tracker")
    private String variantInventoryTracker;
    @Field("Variant Inventory Qty")
    private String variantInventoryQty;
    @Field("Variant Inventory Policy")
    private String variantInventoryPolicy;
    @Field("Variant Fulfillment Service")
    private String variantFulfillmentService;
    @Field("Variant Price")
    private String variantPrice;
    @Field("Variant Compare At Price")
    private String variantCompareAtPrice;
    @Field("Variant Requires Shipping")
    private String variantRequiresShipping;
    @Field("Variant Taxable")
    private String variantTaxable;
    @Field("Variant Barcode")
    private String variantBarcode;
    @Field("Image Src")
    private String imageSrc;
    @Field("Image Position")
    private String imagePosition;
    @Field("Image Alt Text")
    private String imageAltText;
    @Field("Gift Card")
    private String giftCard;
    @Field("SEO Title")
    private String sEOTitle;
    @Field("SEO Description")
    private String sEODescription;
    @Field("Google Shopping / Google Product Category")
    private String googleShoppingGoogleProductCategory;
    @Field("Google Shopping / Gender")
    private String googleShoppingGender;
    @Field("Google Shopping / Age Group")
    private String googleShoppingAgeGroup;
    @Field("Google Shopping / MPN")
    private String googleShoppingMPN;
    @Field("Google Shopping / AdWords Grouping")
    private String googleShoppingAdWordsGrouping;
    @Field("Google Shopping / AdWords Labels")
    private String googleShoppingAdWordsLabels;
    @Field("Google Shopping / Condition")
    private String googleShoppingCondition;
    @Field("Google Shopping / Custom Product")
    private String googleShoppingCustomProduct;
    @Field("Google Shopping / Custom Label 0")
    private String googleShoppingCustomLabel0;
    @Field("Google Shopping / Custom Label 1")
    private String googleShoppingCustomLabel1;
    @Field("Google Shopping / Custom Label 2")
    private String googleShoppingCustomLabel2;
    @Field("Google Shopping / Custom Label 3")
    private String googleShoppingCustomLabel3;
    @Field("Google Shopping / Custom Label 4")
    private String googleShoppingCustomLabel4;
    @Field("Variant Image")
    private String variantImage;
    @Field("Variant Weight Unit")
    private String variantWeightUnit;
    @Field("Variant Tax Code")
    private String variantTaxCode;
    @Field("Cost per item")
    private String costPerItem;

}