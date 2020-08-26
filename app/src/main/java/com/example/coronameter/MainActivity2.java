package com.example.coronameter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final TextView totalCases=findViewById(R.id.totalCases);
        final TextView totalTests=findViewById(R.id.totalTests);
        final TextView cured=findViewById(R.id.cured);
        final TextView deaths=findViewById(R.id.deaths);
        final TextView stateName=findViewById(R.id.stateName);
        final RequestQueue requestQueue= Volley.newRequestQueue(this);
        final JsonObjectRequest jsonObjectRequest=new JsonObjectRequest(Request.Method.GET,"https://api.covid19india.org/v4/data.json",null,new Response.Listener<JSONObject>()
        {
            @Override
            public void onResponse(JSONObject response) {
                try {
                        if((getIntent().getStringExtra("key")).equalsIgnoreCase("Bihar"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("BR").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("BR").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("BR").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("BR").getJSONObject("total").getString("tested"));
                        }
                        else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Andaman and nicobar islands"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("AN").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("AN").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("AN").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("AN").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Andhra Pradesh"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("AP").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("AP").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("AP").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("AP").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Arunachal Pradesh"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("AR").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("AR").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("AR").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("AR").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Assam"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("AS").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("AS").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("AS").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("AS").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Chandigarh"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("CH").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("CH").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("CH").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("CH").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Chhattisgarh"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("CT").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("CT").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("CT").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("CT").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Delhi"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("DL").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("DL").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("DL").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("DL").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Dadra and nagar haveli and daman and diu"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("DN").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("DN").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("DN").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("DN").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Goa"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("GA").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("GA").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("GA").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("GA").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Gujarat"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("GJ").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("GJ").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("GJ").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("GJ").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Himachal pradesh"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("HP").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("HP").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("HP").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("HP").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Haryana"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("HR").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("HR").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("HR").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("HR").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Jharkhand"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("JH").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("JH").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("JH").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("JH").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Jammu and Kashmir"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("JK").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("JK").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("JK").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("JK").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Karnataka"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("KA").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("KA").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("KA").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("KA").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Kerala"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("KL").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("KL").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("KL").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("KL").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Meghalaya"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("ML").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("ML").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("ML").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("ML").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Ladakh"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("LA").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("LA").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("LA").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("LA").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Maharashtra"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("MH").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("MH").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("MH").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("MH").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Manipur"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("MN").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("MN").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("MN").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("MN").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Madhya Pradesh"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("MP").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("MP").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("MP").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("MP").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Mizoram"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("MZ").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("MZ").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("MZ").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("MZ").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Nagaland"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("NL").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("NL").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("NL").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("NL").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Odisha"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("OR").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("OR").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("OR").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("OR").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Punjab"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("PB").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("PB").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("PB").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("PB").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Puducherry"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("PY").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("PY").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("PY").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("PY").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Rajasthan"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("RJ").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("RJ").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("RJ").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("RJ").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Sikkim"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("SK").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("SK").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("SK").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("SK").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Telangana"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("TG").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("TG").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("TG").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("TG").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Tamil Nadu"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("TN").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("TN").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("TN").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("TN").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Uttar Pradesh"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("UP").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("UP").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("UP").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("UP").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Uttarakhand"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("UT").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("UT").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("UT").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("UT").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("West Bengal"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("WB").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("WB").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("WB").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("WB").getJSONObject("total").getString("tested"));
                        }else if((getIntent().getStringExtra("key")).equalsIgnoreCase("Tripura"))
                        {
                            totalCases.setText("Total cases:"+response.getJSONObject("TR").getJSONObject("total").getString("confirmed"));
                            cured.setText("Recovered:"+response.getJSONObject("TR").getJSONObject("total").getString("recovered"));
                            deaths.setText("Deaths:"+response.getJSONObject("TR").getJSONObject("total").getString("deceased"));
                            totalTests.setText("Total tests:"+response.getJSONObject("TR").getJSONObject("total").getString("tested"));
                        }
                    }
                catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity2.this, "Something went wrong!!", Toast.LENGTH_SHORT).show();
            }
        });
        requestQueue.add(jsonObjectRequest);
    }
}