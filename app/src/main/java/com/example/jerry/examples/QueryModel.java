package com.example.jerry.examples;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@Table(database = AppDatabase.class)
public class QueryModel extends BaseModel {
    @PrimaryKey(autoincrement = true)
    public long id;
    @Column
    public String pic;
    @Column
    public String number;
}
