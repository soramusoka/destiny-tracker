package com.soramusoka.destinyApiClient.dto_layer.account_summary.definitions;

import com.soramusoka.destinyApiClient.dto_layer.account_summary.Animation;
import com.soramusoka.destinyApiClient.dto_layer.account_summary.ComputedStat;
import com.soramusoka.destinyApiClient.dto_layer.account_summary.ItemSource;
import com.soramusoka.destinyApiClient.dto_layer.common.BaseDefinition;

import java.util.LinkedHashMap;

public class ItemDefinition extends BaseDefinition {
    public double itemHash;
    public String itemName;
    public String itemDescription;
    public String icon;
    public String secondaryIcon;
    public String displaySource;
    public String actionName;
    public boolean hasAction;
    public boolean deleteOnAction;
    public String tierTypeName;
    public int tierType;
    public String itemTypeName;
    public double bucketTypeHash;
    public double primaryBaseStatHash;
    public LinkedHashMap<String, ComputedStat> stats;
    public double[] perkHashes;
    public int specialItemType;
    public double talentGridHash;
    public EquippingBlock equippingBlock;
    public boolean hasGeometry;
    public double statGroupHash;
    public int[] itemLevels;
    public int qualityLevel;
    public boolean equippable;
    public boolean instanced;
    public double rewardItemHash;
    public String itemIdentifier;
    public String actionDescription;
    public Animation[] animations;
    public Object values;
    public ItemSource[] sources;
    public int itemType;
    public int itemSubType;
    public int classType;
    public double[] itemCategoryHashes;
    public double[] sourceHashes;
    public boolean nonTransferrable;
    public int exclusive;
    public int maxStackSize;
    public int itemIndex;
    public Object[] setItemHashes;
    public double questlineItemHash;
    public boolean needsFullCompletion;
    public String objectiveVerb;
    public Object[] objectiveHashes;
    public boolean allowActions;
    public double questTrackingUnlockValueHash;
    public double bountyResetUnlockHash;
}
