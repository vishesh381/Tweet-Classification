/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package major;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Ruchi
 */
public class CreateChart extends JFrame {
    
    public CreateChart(String appTitle,String chartTitle,int totpos,int totneg,int totneu)
    {
        PieDataset dataset= createDataset(totpos,totneg,totneu);
        JFreeChart chart= createChart(dataset,chartTitle);
        ChartPanel chartPanel= new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500,300));
        setContentPane(chartPanel);
    }
    
    public PieDataset createDataset(int totpos,int totneg,int totneu)
    {
        DefaultPieDataset result=new DefaultPieDataset();
        int total=totpos+totneg+totneu;
        result.setValue("Positive",totpos);
        result.setValue("Negative",totneg);
        result.setValue("Neutral",totneu);
        return result;
    }
    
    public JFreeChart createChart(PieDataset dataset,String Title)
    {
        JFreeChart chart= ChartFactory.createPieChart3D(Title,dataset,true,true,false);
        PiePlot3D plot=(PiePlot3D) chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
    }
}
