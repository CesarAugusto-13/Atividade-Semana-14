import javax.swing.*;
import javax.swing.table.*;
import java.util.ArrayList;
public class TabelaModelo extends AbstractTableModel
{    
   public ArrayList<Pessoas> lista;
   public String[] colunas;
   
   public String getColumnName(int column)
   {
      return colunas[column];
   }

   public TabelaModelo(ArrayList lista,String[] colunas)
   {
      this.lista=lista;
      this.colunas=colunas;
   }
      
   public int getRowCount()
   {
      return lista.size();
   }
   public int getColumnCount()
   {
      return colunas.length;   
   }
   public Object getValueAt(int rowIndex,int columnIndex)
   {
      if(columnIndex == 0)
      {
         return lista.get(rowIndex).getNome();
         
      }
      else if(columnIndex == 1)
      {
         return lista.get(rowIndex).getIdade();
         
      }
      else if(columnIndex == 2)
      {
         return lista.get(rowIndex).getSexo();
         
      }
      else if(columnIndex == 3)
      {
         return lista.get(rowIndex).getEndereco();
         
      }
      else if(columnIndex == 4)
      {
         return lista.get(rowIndex).getVegetariano();
         
      }
      else
      {
         return lista.get(rowIndex).getEsporte();
         
      }   
   }
   public Class getColumnClass(int columnIndex)
   {
      return getValueAt(0,columnIndex).getClass();
   }
   
}