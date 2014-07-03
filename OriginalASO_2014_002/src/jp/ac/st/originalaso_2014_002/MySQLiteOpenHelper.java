package jp.ac.st.originalaso_2014_002;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLiteOpenHelper extends SQLiteOpenHelper {


	public MySQLiteOpenHelper(Context context) {
		super(context,"2014021201752.sqlite3",null,1);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO 自動生成されたメソッド・スタブ
		db.execSQL("CREATE TABLE IF NOT EXISTS" +
				"Hitokoto(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,phrase fTEXT)");

	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO 自動生成されたメソッド・スタブ
			db.execSQL("drop table Hitokoto ");
			onCreate(db);
	}	

}
