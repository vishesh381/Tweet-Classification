/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package major;

import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Ruchi
 */
public class CreateBarChart extends JFrame {
    
    public CreateBarChart(String appTitle,String chartTitle,int[] arr1,int[] arr2,int[] arr3)
    {
        DefaultCategoryDataset dataset1= createDataset(arr1,arr2,arr3);
        JFreeChart chart= createChart(dataset1,chartTitle);
        ChartPanel chartPanel= new ChartPanel(chart);
     
        chartPanel.setPreferredSize(new java.awt.Dimension(1000,500));
        setContentPane(chartPanel);
    }
    
    public DefaultCategoryDataset createDataset(int[] arr,int[] arr2,int[] arr3)
    {
        DefaultCategoryDataset result=new DefaultCategoryDataset();
        
        result.setValue(arr[0],"WEEK1 TWEETS","Positive");
        result.setValue(arr[1],"WEEK1 TWEETS","Negative");
        result.setValue(arr[2],"WEEK1 TWEETS","Neutral");
        
         result.setValue(arr2[0],"WEEK2 TWEETS","Positive");
        result.setValue(arr2[1],"WEEK2 TWEETS","Negative");
        result.setValue(arr2[2],"WEEK2 TWEETS","Neutral");
        
         result.setValue(arr3[0],"WEEK3 TWEETS","Positive");
        result.setValue(arr3[1],"WEEK3 TWEETS","Negative");
        result.setValue(arr3[2],"WEEK3 TWEETS","Neutral");
        return result;
    }
    
    public JFreeChart createChart(DefaultCategoryDataset dataset,String Title)
    {
        JFreeChart barChart= ChartFactory.createBarChart("Tweets Analysis of " + Title,"Sentiments","Number of Tweets",dataset,PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot BarC=barChart.getCategoryPlot();
        BarC.setRangeGridlinePaint(Color.ORANGE);
        return barChart;
    }
}
