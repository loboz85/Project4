/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.Project4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the before 1990 category
        TextView before1990 = findViewById(R.id.before1990);

        // Set a click listener on that View
        before1990.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the before1990 View is clicked on.
            @Override
            public void onClick(View view) {
                Intent before1990Intent = new Intent(MainActivity.this, Before1990.class);
                startActivity(before1990Intent);
            }
        });

        // Find the View that shows the after 1990 category
        TextView after1990 = findViewById(R.id.after1990);

        // Set a click listener on that View
        after1990.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the after1990 View is clicked on.
            @Override
            public void onClick(View view) {
                Intent after1990Intent = new Intent(MainActivity.this, After1990.class);
                startActivity(after1990Intent);
            }
        });

        // Find the View that shows the after 2010 category
        TextView after2010 = findViewById(R.id.after2010);

        // Set a click listener on that View
        after2010.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the after2010 View is clicked on.
            @Override
            public void onClick(View view) {
                Intent after2010Intent = new Intent(MainActivity.this, After2010.class);
                startActivity(after2010Intent);
            }
        });

        // Find the View that shows the after 2000 category
        TextView after2000 = findViewById(R.id.after2000);

        // Set a click listener on that View
        after2000.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the after2000 View is clicked on.
            @Override
            public void onClick(View view) {
                Intent after2000Intent = new Intent(MainActivity.this, After2000.class);
                startActivity(after2000Intent);
            }
        });

        // Find the View that shows the after 1993 category
        TextView after1993 = findViewById(R.id.after1993);

        // Set a click listener on that View
        after1993.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the after1993 View is clicked on.
            @Override
            public void onClick(View view) {
                Intent after1993Intent = new Intent(MainActivity.this, After1993.class);
                startActivity(after1993Intent);
            }
        });

    }


}
