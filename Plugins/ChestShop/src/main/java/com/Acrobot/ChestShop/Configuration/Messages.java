// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Messages.java

package com.Acrobot.ChestShop.Configuration;

import org.bukkit.ChatColor;

public class Messages
{

    public Messages()
    {
    }

    public static String prefix(String message)
    {
        return (new StringBuilder()).append(prefix).append(message).toString();
    }

    public static String prefix;
    public static String iteminfo;
    public static String ACCESS_DENIED = "해당 작업을 위한 권한이 없습니다!";
    public static String NOT_ENOUGH_MONEY = "돈이 부족합니다!";
    public static String NOT_ENOUGH_MONEY_SHOP = "상점 주인의 돈이 부족합니다!";
    public static String CLIENT_DEPOSIT_FAILED = "당신의 계좌로 입금하는데 실패했습니다.";
    public static String SHOP_DEPOSIT_FAILED = "상점 주인의 계좌로 입금하는데 실패했습니다.";
    public static String NO_BUYING_HERE = "이곳에선 구매할 수 없습니다!";
    public static String NO_SELLING_HERE = "이곳에선 판매할 수 없습니다!";
    public static String NOT_ENOUGH_SPACE_IN_INVENTORY = "인벤토리에 충분한 공간이 없습니다!";
    public static String NOT_ENOUGH_SPACE_IN_CHEST = "상자에 충분한 공간이 없습니다!";
    public static String NOT_ENOUGH_ITEMS_TO_SELL = "팔 수 있는 아이템이 없습니다!";
    public static String NOT_ENOUGH_STOCK = "매진되었습니다.";
    public static String NOT_ENOUGH_STOCK_IN_YOUR_SHOP = "상점의 %material 재고가 매진되었습니다.";
    public static String YOU_BOUGHT_FROM_SHOP = "%owner씨의 %item을 %price에 샀습니다.";
    public static String SOMEBODY_BOUGHT_FROM_YOUR_SHOP = "%buyer씨가 %item을 %price에 샀습니다.";
    public static String YOU_SOLD_TO_SHOP = "%item을 %buyer씨에게 %price에 팔았습니다.";
    public static String SOMEBODY_SOLD_TO_YOUR_SHOP = "%seller씨가 %item을 %price에 팔았습니다.";
    public static String YOU_CANNOT_CREATE_SHOP = "이 종류의 상점은 만들 수 없습니다.";
    public static String NO_CHEST_DETECTED = "상자를 찾을 수 없습니다!";
    public static String INVALID_SHOP_DETECTED = "이 상점은 사용될 수 없습니다!";
    public static String CANNOT_ACCESS_THE_CHEST = "상자에 접근할 권한이 없습니다!";
    public static String PROTECTED_SHOP = "이 상점은 LWC로 보호됩니다!";
    public static String SHOP_CREATED = "상점이 성공적으로 개설되었습니다!";
    public static String SHOP_FEE_PAID = "자릿세로 %amount를 지불하였습니다.";
    public static String SHOP_REFUNDED = "%amount를 환불받았습니다.";
    public static String ITEM_GIVEN = "%item을(를) %player씨에게 주었습니다.";
    public static String RESTRICTED_SIGN_CREATED = "팻말이 성공적으로 생성되었습니다!";
    public static String PLAYER_NOT_FOUND = "플레이어를 찾을 수 없습니다!";
    public static String NO_PERMISSION = "해당 작업을 위한 권한이 없습니다!";
    public static String INCORRECT_ITEM_ID = "올바른 아이템 ID를 입력해주세요.";
    public static String NOT_ENOUGH_PROTECTIONS = "보호되지 않습니다!";
    public static String CANNOT_CREATE_SHOP_HERE = "이곳에 개설할 수 없습니다!";
    public static String TOGGLE_MESSAGES_OFF = "더 이상 상점에서 메시지를 받을 수 없습니다.";
    public static String TOGGLE_MESSAGES_ON = "이제 상점에서 메시지를 받을 수 있습니다.";

    static 
    {
        prefix = (new StringBuilder()).append(ChatColor.GREEN).append("[Shop] ").append(ChatColor.RESET).toString();
        iteminfo = (new StringBuilder()).append(ChatColor.GREEN).append("Item Information: ").append(ChatColor.RESET).toString();
    }
}
