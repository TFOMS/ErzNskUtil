package erznskutil.logic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="count_ffoms_xml_rab")
public class CountFfomsXmlRab {
    
    private String data;    
    private int count;
    
    public CountFfomsXmlRab(){
    	data = null;
    }
    
    @Id
    @Column(name="data")
    public String getData(){
        return data;
    }
    
    @Column(name="count")
    public int getCount(){
        return count;
    }
    
    public void setData(String s){
        data = s;     
    }
    
    public void setCount(int l){
        count = l;
    }   
}