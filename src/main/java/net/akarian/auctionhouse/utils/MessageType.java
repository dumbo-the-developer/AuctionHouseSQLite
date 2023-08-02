package net.akarian.auctionhouse.utils;

public enum MessageType {

    MESSAGE_SYNTAX_LIST("Auction House List Syntax"),
    MESSAGE_SYNTAX_SEARCH("Auction House Search Syntax"),
    MESSAGE_ERRORS_PLAYER("Command Only Player Executable"),
    MESSAGE_ERRORS_NOITEM("No Item in Hand"),
    MESSAGE_ERRORS_PRICE("Invalid Price"),
    MESSAGE_ERRORS_LISTINGNOTFOUND("Listing No Longer Exists"),
    MESSAGE_ERRORS_POOR("Not Enough Money"),
    MESSAGE_ERRORS_NUMBER("Not a Valid Number"),
    MESSAGE_ERRORS_PERCENTAGE("Not a Valid Percentage"),
    MESSAGE_ERRORS_ZERO("Amount Less Than Zero"),
    MESSAGE_ERRORS_STACKSIZE("Stack Size to Large"), //TODO Correct Spelling in Main Template
    GUI_SETTINGS_ADMINMODE_NAME("Settings GUI Admin Button Name"),
    GUI_SETTINGS_ADMINMODE_LORE("Settings GUI Admin Button Lore"),
    MESSAGE_GEN_PREFIX("Prefix Splitter"),
    GUI_SETTINGS_EXPIRATION_NAME("Settings GUI Expiration Button Name"),
    GUI_SETTINGS_EXPIRATION_LORE("Settings GUI Expiration Button Lore"),
    GUI_SETTINGS_EXPIRATION_MESSAGE("Settings GUI Expiration Button Message"),
    GUI_SETTINGS_EXPIRATIONTIME_NAME("Settings GUI Expiration Time Button Name"),
    GUI_SETTINGS_EXPIRATIONTIME_LORE("Settings GUI Expiration Time Button Lore"),
    GUI_SETTINGS_EXPIRATIONTIME_MESSAGE("Settings GUI Expiration Time Button Message"),
    GUI_SETTINGS_LISTINGBOUGHT_NAME("Settings GUI Listing Bought Button Name"),
    GUI_SETTINGS_LISTINGBOUGHT_LORE("Settings GUI Listing Bought Button Lore"),
    GUI_SETTINGS_LISTINGBOUGHT_MESSAGE("Settings GUI Listing Bought Button Message"),
    GUI_SETTINGS_SOUNDS_NAME("Settings GUI Sounds Button Name"),
    GUI_SETTINGS_SOUNDS_LORE("Settings GUI Sounds Button Lore"),
    GUI_SETTINGS_LISTINGCREATED_NAME("Settings GUI Listing Created Button Name"),
    GUI_SETTINGS_LISTINGCREATED_LORE("Settings GUI Listing Created Button Lore"),
    GUI_SETTINGS_LISTINGCREATED_MESSAGE("Settings GUI Listing Created Button Message"),
    GUI_SETTINGS_AUTOCONFIRM_NAME("Settings GUI Auto Confirm Button Name"),
    GUI_SETTINGS_AUTOCONFIRM_LORE("Settings GUI Auto Confirm Button Lore"),
    GUI_SETTINGS_LISTINGFEE_NAME("Settings GUI Listing Fee Button Name"),
    GUI_SETTINGS_LISTINGFEE_LORE("Settings GUI Listing Fee Button Lore"),
    GUI_SETTINGS_LISTINGFEE_MESSAGE("Settings GUI Listing Fee Button Message"),
    GUI_SETTINGS_SALESTAX_NAME("Settings GUI Sales Tax Button Name"),
    GUI_SETTINGS_SALESTAX_LORE("Settings GUI Sales Tax Button Lore"),
    GUI_SETTINGS_SALESTAX_MESSAGE("Settings GUI Sales Tax Button Message"),
    GUI_SETTINGS_CREATIVELISTING_NAME("Settings GUI Creative Listing Button Name"),
    GUI_SETTINGS_CREATIVELISTING_LORE("Settings GUI Creative Listing Button Lore"),
    GUI_SETTINGS_CREATIVELISTING_MESSAGE("Settings GUI Creative Listing Button Message"),
    GUI_SETTINGS_LISTINGTIME_NAME("Settings GUI Listing Time Button Name"),
    GUI_SETTINGS_LISTINGTIME_LORE("Settings GUI Listing Time Button Lore"),
    GUI_SETTINGS_LISTINGTIME_MESSAGE("Settings GUI Listing Time Button Message"),
    MESSAGE_GEN_BOUGHTBUYER("Message sent to Buyer when buying Listing"),
    MESSAGE_GEN_BOUGHTCREATOR("Message sent to Creator when Listing bought"),
    MESSAGE_GEN_LISTINGREMOVED("Message sent to Creator when Listing is removed by Admin"),
    MESSAGE_GEN_LISTINGCREATED("Message sent to Creator when Listing is created"),
    MESSAGE_GEN_EXPIREDJOIN("Message sent to Player on join containing expired listings"),
    MESSAGE_GEN_MINLISTINGPRICE("Message sent to Player when the Listing Price is too low"),
    MESSAGE_GEN_MAXLISTINGPRICE("Message sent to Player when the Listing Price is too high"),
    MESSAGE_GEN_COOLDOWN("Message sent to Player when on Cooldown"),
    MESSAGE_GEN_MAXLISTINGS("Message sent to Player when they have reached maximum Listings"),
    MESSAGE_GEN_EXPIREDRECLAIMED("Message sent to Player when they reclaim Listings"),
    MESSAGE_GEN_SAFEREMOVE("Message sent to Admin when Safe Removing Listing"),
    MESSAGE_GEN_POORLISTINGFEE("Message sent when the Player cannot afford the Listing Fee"),
    MESSAGE_GEN_INCOMPATIBLEPRICE("Message sent when the Player inputs an incompatible price."),
    MESSAGE_GEN_RELOADSTART("Message sent when AH Reload starts"),
    MESSAGE_GEN_RELOADCOMPLETE("Message sent when the AH Reload is complete"),
    MESSAGE_BLACKLIST_BLOCKED("Message sent when the Player tries to list a blacklisted item"),
    BUTTONS_PPAGE_NAME("Previous Page Button Name"),
    BUTTONS_PPAGE_LORE("Previous Page Lore"),
    BUTTONS_NPAGE_NAME("Next Page Button Name"),
    BUTTONS_NPAGE_LORE("Next Page Button Lore"),
    BUTTONS_CONFIRM_NAME("Confirm Button Name"),
    BUTTONS_CONFIRM_LORE("Confirm Button Lore"),
    BUTTONS_DENY_NAME("Deny Button Name"),
    BUTTONS_DENY_LORE("Deny Button Lore"),
    BUTTONS_RETURN_NAME("Return Button Name"),
    BUTTONS_RETURN_LORE("Return Button Lore"),
    BUTTONS_CLOSE_NAME("Close Button Name"),
    BUTTONS_CLOSE_LORE("Close Button Lore"), //TODO Make a list in Main Template
    GUI_MAIN_SEARCH_NAME("Search Button Name"),
    GUI_MAIN_SEARCH_LORE("Search Button Lore"),
    GUI_MAIN_TITLE("Auction House Default Title"),
    GUI_MAIN_SEARCH_LEFT("Search Interact Left Click"),
    GUI_MAIN_SEARCH_RIGHT("Search Interact Right Click"),
    GUI_MAIN_INFO_NAME("Auction House Information Button Name"),
    GUI_MAIN_INFO_LORE("Auction House Information Button Lore"),
    GUI_MAIN_UNCLAIMED_NAME("Auction House Unclaimed Listings Name"),
    GUI_MAIN_UNCLAIMED_LORE("Auction House Unclaimed Listings Lore"),
    GUI_MAIN_SORT_NAME("Auction House Sort Button Name"),
    GUI_MAIN_SORT_LORE("Auction House Sort Button Lore"),
    GUI_MAIN_LISTING_ACTIVE("Main Active Listing Template"),
    GUI_MAIN_INFO_SELLER("Information put at the bottom of the listing if the creator is viewing."),
    GUI_MAIN_INFO_BUYER("Information put at the bottom of the listing if a buyer is viewing."), //TODO Correct Spelling in the Main Template
    GUI_MAIN_LISTING_EXPIRED("Main Expired Listing Template"),
    GUI_MAIN_LISTING_EXPIRED_ADMIN("Admin Expired Listing Template"),
    GUI_MAIN_LISTING_COMPLETED_ADMIN("Admin Completed Listing Template"),
    GUI_MAIN_LISTING_COMPLETED("Main Completed Listing Template"),
    MESSAGE_SYNTAX_SELLERTAG("Seller Tag for Searching"),
    GUI_CONFIRMBUY_TITLE("Confirm Listing Buy GUI Title"),
    GUI_UNCLAIMED_TITLE("Unclaimed Listing GUI Title"),
    GUI_LISTINGEDIT_TITLE("Listing Edit GUI Title"),
    GUI_LISTINGEDIT_PRICE_MESSAGE("Message sent to Creator when editing price of a Listing."),
    GUI_LISTINGEDIT_PRICE_NAME("Listing Edit Edit Price Name"),
    GUI_LISTINGEDIT_PRICE_LORE("Listing Edit Edit Price Lore"),
    GUI_LISTINGEDIT_AMOUNT_NAME("Listing Edit Edit Amount Name"),
    GUI_LISTINGEDIT_AMOUNT_LORE("Listing Edit Edit Amount Lore"),
    GUI_LISTINGEDIT_AMOUNT_MESSAGE("Message sent to Creator when editing amount of a Listing."),
    GUI_SHULKER_TITLE("Shulker View GUI Title"),//TODO Change from GUI_LISTINGEDIT_SHULKER_NAME
    GUI_SHULKER_LORE("Shulker View GUI Lore"), //TODO Change from GUI_LISTINGEDIT_SHULKER_LORE
    GUI_SORT_TITLE("Sort GUI Title"),
    GUI_SORT_OVERALLPRICE_NAME("Sort GUI Overall Price Name"),
    GUI_SORT_OVERALLPRICE_LORE("Sort GUI Overall Price Lore"),
    GUI_SORT_TIMELEFT_NAME("Sort GUI Time Left Name"),
    GUI_SORT_TIMELEFT_LORE("Sort GUI Time Left Lore"),
    GUI_SORT_COSTPERITEM_NAME("Sort GUI Cost per Item Name"),
    GUI_SORT_COSTPERITEM_LORE("Sort GUI Cost per Item Lore"),
    GUI_SORT_AMOUNTOFITEMS_NAME("Sort GUI Amount of Items Name"),
    GUI_SORT_AMOUNTOFITEMS_LORE("Sort GUI Amount of Items Lore"),
    GUI_SORT_LONGEST("Sort GUI Sort Longest"),
    GUI_SORT_SHORTEST("Sort GUI Sort Shortest"),
    GUI_SORT_HIGHEST("Sort GUI Sort Highest"),
    GUI_SORT_LOWEST("Sort GUI Sort Lowest"),
    GUI_MAINADMIN_TITLE("Admin Auction House GUI Title"),
    GUI_MAINADMIN_LISTING("Admin Main Active Listing"),
    GUI_NPC_LORE("NPC GUI NPC Lore"),
    GUI_CONFIRMLIST_LORE("Confirm List GUI Lore"),
    GUI_CONFIRMLIST_TITLE("Confirm List GUI Title"),
    GUI_SOUND_TITLE("Sound Select GUI Title"),
    MESSAGE_BLACKLIST_ADD("Message sent to player when adding an item to the blacklist"),
    MESSAGE_BLACKLIST_REMOVE("Message sent to player when removing an item from the blacklist");
    private final String value;

    MessageType(String value) {
        this.value = value;
    }

    public String formatted() {
        return value;
    }

}
