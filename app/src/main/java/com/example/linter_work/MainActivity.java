package com.example.linter_work;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private String url="https://restcountries.eu/rest/v2/region/asia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestQueue requestQueue= Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url,
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response)
                    {

                        // JSONArray jsonArray=response;
                        try {

                            for(int i=0;i<response.length();i++){
                                // Get current json object
                                JSONObject student = response.getJSONObject(i);

                                // Get the current student (json object) data
                                String Cou_Name = student.getString("name");
                                String Cou_Captial= student.getString("capital");
                                String Cou_Region = student.getString("region");
                                String Cou_Populatio=student.getString("population");
                                String Flage_url=student.getString("flag");
                                Log.i("checkflag",Flage_url);
                                //JSONObject JsLanguage=response.getJSONObject()
                                JSONArray JArrBoundry=student.getJSONArray("borders");
                                for(int j1=0;j1<JArrBoundry.length();j1++)
                                {
                                    String Bouder_value=JArrBoundry.getString(j1);
                                    Log.i("check007",Bouder_value+"  \n");

                                }

                                JSONArray JArrBoundry01=student.getJSONArray("languages");
                                for(int j2=0;j2<JArrBoundry01.length();j2++)
                                {
                                    JSONObject Lau_value01=JArrBoundry01.getJSONObject(j2);
                                    String Lau_value=Lau_value01.getString("name");
                                    Log.i("check007",Lau_value+"  \n");

                                }
                                //String Cou_Language=student.getString("population");
                                String Cou_Subregion=student.getString("subregion");

                                Log.i("check007",Cou_Name+"  "+Cou_Captial+"  "+Cou_Populatio+"  "+Cou_Subregion+"   "+Cou_Region);

                            }

                           // JSONObject j1= response.getJSONObject(0);
                            //txt1.setText(j1.getString("name"));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
//                      String s1=j1.getString("gender");


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {
                    }
                });
        requestQueue.add(jsonArrayRequest);


    }



}