package com.headerphile.olevegard.legopartdb.Database;

import android.annotation.TargetApi;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.Build;
import android.util.Log;

import java.util.ArrayList;

public class MyDBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Lego";
    private static final String TABLE_PART = "Part";

    public static final String COLUMN_PART_ID = "PartId";
    public static final String COLUMN_DESCRITION = "Description";
    public static final String COLUMN_WIDTH = "Width";
    public static final String COLUMN_LENGTH = "Length";
    public static final String COLUMN_HEIGHT = "Height";

    public MyDBHandler(Context context, String name,
                       SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    public void onCreate(SQLiteDatabase db) {
        String tableQuery = "CREATE TABLE " + TABLE_PART  + " ( " +
            COLUMN_PART_ID + " varchar(10) NOT NULL," +
            COLUMN_DESCRITION + " varchar(200)," +
            COLUMN_WIDTH + " float NOT NULL," +
            COLUMN_LENGTH + " float NOT NULL," +
            COLUMN_HEIGHT + " float DEFAULT 1 NOT NULL," +
            "PRIMARY KEY (" + COLUMN_PART_ID + ")," +
            "CONSTRAINT ID UNIQUE (" + COLUMN_PART_ID + ")" +
        ")";

        try{
            db.execSQL(tableQuery);
        } catch (Exception e){
            Log.d("DEBUG", "Something bad happened " + e.getMessage());

        }
    }

    public void buildDb(){
        try {
            SQLiteDatabase db = this.getWritableDatabase();
            db.execSQL("Delete from " + TABLE_PART );
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('193au', 'Minifig, Headgear, Helmet, Old thin chinstrap, Visor dimple presence', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2343', 'Minifig, Utensil, Goblet', 1.0, 1.0, 1.0)");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2349', 'Hinge, Roof, Sunroof, Frame', 4.0, 4.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2357', 'Brick, Modified, Corner', 2.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2412', 'Tile, Modified grille', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2433', 'Hinge, Bar, 3 fingers, End stud', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2444', 'Plate, Modified, Pin hole', 2.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2446', 'Minifig, Headgear, Helmet, Standard', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2447', 'Minifig, Headgear, Visor', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2516', 'Minifig, Utensil, Tool, Chainsaw, Body', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2542', 'Minifig, Utensil, Paddle', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2569', 'Antenna, Whip', 1.0, 1.0, 9.66);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2570', 'Minifig, Weapon, Crossbow', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2582px2', 'Hinge, Panel, Yellow submarine pattern', 2.0, 4.0, 3.33);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2584', 'String, Reel, Holder', 2.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2585', 'String, Reel, Drum', 2.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2599', 'Minifig, Footgear, Flipper', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2607', 'Magnet, Holder', 2.0, 3.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2609b', 'Magnet. Holder', 2.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2626', 'Brick, Boat, Bow', 6.0, 6.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2650', 'Hook, Slider, Arm base, Three finger hinge', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2651', 'Hook, Slider, Arm / Hook', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2877', 'Brick, Modified, Grille', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('2880', 'Hinge, Bar, 2.5L, 2 and 3 fingers on ends', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('298c01', 'Lever, Small, Base see(4592c01)', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3002', 'Brick', 2.0, 3.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('30034', 'Panel, Solar clip-on, Deltoid', 3.0, 5.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3004', 'Brick', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3004px1', 'Brick, 3.09 octan pattern', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3005', 'Brick', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3009', 'Brick', 1.0, 6.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('30208', 'Cylinder, Hemisphere, Multifaceted', 2.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3022', 'Plate', 2.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3023', 'Plate', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3024', 'Plate', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3027', 'Plate', 6.0, 16.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3039', 'Slope, 45', 2.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3041', 'Slope, 45, Double', 2.0, 4.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3045', 'Slope, Double convex', 2.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3062b', 'Brick, Round, Open stud', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3069bp02', 'Plate, Tape reels pattern', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3069bp25', 'Tile, Computer pattern', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3069bp52', 'Tile, Telemetry pattern', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3070b', 'Tile, Grove', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('307bp02', 'Plate, Pattern, Number 2', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3139', 'Wheel, 8mm 6mm, Black tire 14mm, D. x 4mm, Smooth Single', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3262pb69', 'Minifig, Head, Headset over smile, red-brown hair and eyebrows pattern', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3475', 'Engine, Smooth, Small, Side plate, Undetermined', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3479', 'Tail', 4.0, 2.0, 2.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3516', 'Minifig, Utensil, Tool, Chainsaw, Body', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3597', 'Hinge, Plate, Digger bucket holder, Female', 2.0, 4.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3612', 'Arm, Straight, 2 and 3 fingers', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3622', 'Brick', 1.0, 3.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3623', 'Plate', 1.0, 3.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3626bp05', 'Minifig, Head, Male, Standard grin and eyebrows pattern', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3626bp62', 'Minifig, Head, Male white bangs messy hair', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3633', 'Fence', 1.0, 4.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3641', 'Wheel, 8mm D x 6mm, Black tire offset tread small', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3660', 'Slope, 45, Inverted', 2.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3665', 'Slope, 45, Inverted', 2.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3680c01', 'Plate, Turntable, Light gray top', 2.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3741', 'Plant, Flower, Stem', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3742', 'Plant, Flower, Small', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3794', 'Plate, One stud center', 3.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3829c01', 'Vehicle, Steering stand, Blackl steering wheel', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3836', 'Minifig, Utensil, Pushbroom', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3837', 'Minifig, Utensil, Spade', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3838', 'Minifig, Airtanks', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3846px9', 'Minifig, Shield, Triangular, Black Falcon and Blue Border', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3847', 'Minifig, Weapon, Sword, Shortsword', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3848', 'Minifig, Weapon, Halberd', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3852', 'Minifig, Utensil, Tool, Hairbrush', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3853', 'Window', 1.0, 4.0, 3.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3855a', 'Glass, For windows ( 1 x 4 x 3 )', 1.0, 4.0, 3.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3857', 'Baseplate', 16.0, 32.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3899', 'Minifig, Utensil, Cup', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3901', 'Minifig, Hair, Male', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3933', 'Wedge, Wing, Left', 8.0, 4.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3934', 'Wedge, Wing, Right', 8.0, 4.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3937', 'Hinge, Brick, Base', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3938', 'Hinge, Brick, Top', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3957', 'Antenna', 1.0, 4.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('3960', 'Dish, Round, Inverted', 4.0, 4.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4006', 'Minifig, Utensil, Spanner wrench / screwdriver', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4070', 'Brick, Modified, Headlight', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4071', 'Door, Frame', 2.0, 6.0, 7.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4073', 'Plate, Round, Straight side', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4079', 'Minifig, Utensil, Seat', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4081b', 'Plate. Modified, Clip light - thick ring', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4083', 'Bar. Studs', 1.0, 4.0, 2.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4085', 'Plate, Modified, Clip, Vertical', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4095', 'Bar, Stop ring, 6.66L', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('412', 'Arm, Turned, 2 and 3 fingers', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4210', 'Drum, String reel', 2.0, 4.0, 2.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4212a', 'Vehicle, Base, 2x2 Recessed center, Smooth underside, Center hole', 4.0, 10.0, 0.66);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4212b', 'Vehicle, Base, 2x2 Recessed center, Smooth underside, No center hole', 4.0, 10.0, 0.66);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4214', 'Hinge, Vehicle roof holder', 1.0, 4.0, 2.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4221', 'Arm, Grab claw', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4275', 'Hinge, Plate, 3 fingers', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4276', 'Hinge, Plate, 2 fingers', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4286', 'Slope, 33', 3.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4315', 'Hinge, Roof, Holder', 1.0, 4.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4318', 'Special, Boat, Mast', 2.0, 2.0, 9.66);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4347', 'Window, Fixed glass', 1.0, 4.0, 5.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4349', 'Minifig, Utensil, Megaphonne', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4360', 'Minifig, Utensil, Camera, Side sight', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4447', 'Window, Roof', 4.0, 4.0, 3.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('44658a', 'Minifig, Weapon, Knife', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4477', 'Plate', 1.0, 10.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4485', 'Minifig, Headgear, Cap, Long flat bill', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4495', 'Flag, Waving', 4.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4497', 'Minifig, Weapon, Spear, Pike', 1.0, 0.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4498', 'Minifig, Weapon, Quiver', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4524', 'Minifig, Cape', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4528', 'Minifig, Utensil, Frying Pan', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4530', 'Minifig, Hair, Female', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4532', 'Container, Cupboard', 2.0, 3.0, 2.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4589', 'Cone', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4590', 'Modified, Offset', 1.0, 4.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4592c02', 'Lever, Small, Base, Black lever see(298c01)', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4596', 'Plate, Modified, Long stud receptacle', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4624', 'Wheel, 8mm D x 6mm, Black tire offset tread small', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4625', 'Hinge, Tile', 1.0, 4.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4719c01', 'Bicycle, Complete', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4733', 'Brick, Studs on all sides', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4740', 'Dish, Round, Inverted', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('476', 'Special, Boat, Mast, Open stud towball', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4865', 'Panel', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('48682', 'Engine, Smooth large, Thin top plate', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4868ac01', 'Engine, Smooth large, Thin top plate, Light grey center (4868a / 4869)', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('4869', 'Engine, Smooth large, Center', 1.0, 2.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('52', 'Crystal, 5 point', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('57467a', 'Minifig, Weapon, Harpoon', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6014a', 'Wheel, 11mm D x 12mm, Hole round for wheel holder pin', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6019', 'Plate, Modified, Clip, Horizontal', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6039', 'Brick, Cone, Octagonal', 2.0, 2.0, 2.33);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6040', 'Propeller Housing', 5.0, 5.0, 3.66);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6042', 'Brick, Modified, Octagonal. Side studs', 2.0, 2.0, 3.33);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6065', 'Plant, Prickly brush, 2x2 center', 2.0, 2.0, 3.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6117', 'Minifig, Utensil, Tool, Chainsaw, Blade', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6120', 'Minifig, Utensil, Ski with hinge', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6140', 'Bar, Studs, Closed', 1.0, 6.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6217', 'Arm, Turned, Pin, 3 fingers', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6426a', 'Minifig, Utensil, Tool, Screewdriver, Narrow head', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6426b', 'Minifig, Utensil, Tool, Hammer, Cross pein', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6426c', 'Minifig, Utensil, Tool, Power drill', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6426d', 'Minifig, Utensil, Tool, Wrench, Box', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6426e', 'Minifig, Utensil, Tool, Wrench, Open end', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('6426f', 'Minifig, Utensil, Tool, Wrench, Oil can', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('70001pb01', 'Minifig, Utensil, Compass', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('73092', 'Magnet, Cylindrical', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('73590c01a', 'Hose, Flexible, Tabless Ends, 8.5l, End Same color as tube', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('770p4c', 'Minifig, Shield, Ovid, Dragon Blue And Red Pattern', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('9070c09', 'Minifig, Legs', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('970c00', 'Minifig, Hips and legs', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('973p01c01', 'Minifig, Torso, Vertical striped red/blue pattern', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('973p0bc01', 'Minifig, Torso', 0.0, 0.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('973p14c01', 'Minifig, Torso, Twon S Logo Red Black pattern', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('973p43c01', 'Minifig, Torso, Castle Black Falcon Pattern Old Style ', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('973pdac04', 'Minifig,Torso, Zipper curved on jacket and pocket', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('ba06pb07', 'Stickered assembly, Octan logo', 4.0, 1.0, 3.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('Sailbb19', 'Special, Sail, Red Flying Dragon Pattern', 12.0, 10.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('x168', 'Minifig, Headgear, Helmet, Underwater, Hose', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('x42', 'Minifig, Headgear, Visor', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('x46', 'Minifig, Plume, Dragon, Left', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('x47', 'Minifig, Plume, Dragon', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('x48', 'Minifig, Plume, Dragon, Right', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('x66px8', 'Special, Sail, Withe red blue wavy pattern', 6.0, 12.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('x77', 'String, Cord, Undetermined', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('x77a', 'String, Cord, Thin', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('x77b', 'String, Cord, Thick', 1.0, 1.0, 1.0);");
            db.execSQL("INSERT INTO Part (PartId, Description, Width, Length, Height) VALUES ('x88', 'Rubbar band, Small, Square cross sextion', 1.0, 1.0, 1.0);");
        } catch (Exception e){
            Log.d("DEBUG", "Build query failed");
        }
    }

    private static LegoPart createLegoPartFromCursor(Cursor cursor ){
        return new LegoPart(
            cursor.getString(0),
            cursor.getString(1),
            cursor.getInt(2),
            cursor.getInt(3),
            cursor.getInt(4));
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PART );
        onCreate(db);

    }

    public void addPart(String id) {
        ContentValues values = new ContentValues();

        values.put(COLUMN_PART_ID, id);
        values.put(COLUMN_DESCRITION ,"desc");
        values.put(COLUMN_WIDTH , 1);
        values.put(COLUMN_LENGTH, 1);
        values.put(COLUMN_HEIGHT, 1);

        SQLiteDatabase db = this.getWritableDatabase();

        db.insert(TABLE_PART, null, values);
        db.close();
    }

    public ArrayList<LegoPart> getAllParts(){
        String query = "Select * FROM " + TABLE_PART;

        ArrayList<LegoPart> allParts = new ArrayList<>();

        try {
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor cursor = db.rawQuery(query, null);

            while (cursor.moveToNext()) {
                allParts.add(createLegoPartFromCursor(cursor));
            }
        } catch (Exception e){
            Log.d("DEBUG", e.getMessage());
        }

        return allParts;
    }
    public LegoPart getPart(String id) {

        String query = "Select * FROM " + TABLE_PART + " where PartId='" + id + "'";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        boolean found = cursor.moveToNext();
        if (!found){
            Log.d("DEBUG", "No part found for : " + id);
            return null;
        }

        LegoPart legoPart = createLegoPartFromCursor(cursor);

        cursor.close();
        db.close();

        return legoPart;
    }


}


