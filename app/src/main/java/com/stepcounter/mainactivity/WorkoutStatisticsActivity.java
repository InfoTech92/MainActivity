package com.stepcounter.mainactivity;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.example.mainactivity.R;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * This activity shows a training statistics.
 *
 */
public class WorkoutStatisticsActivity extends ActionBarActivity implements OnClickListener{
	
	/**
	 * OnCreate method.
	 */
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_statistics);
        
        //Graph creation.
        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                  new DataPoint(0, 1),
                  new DataPoint(1, 5),
                  new DataPoint(2, 3),
                  new DataPoint(3, 2),
                  new DataPoint(4, 6)
        });
        graph.addSeries(series);
        
	}
	
	
	/**
	 * OnClickListener method implementation.
	 */
	@Override
	public void onClick(View v) {
		
		
	}
	
}
