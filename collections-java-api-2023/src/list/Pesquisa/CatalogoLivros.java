package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if ( !livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }


    public List<Livro> pesquisarIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if ( !livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPubicacao() >= anoInicial && l.getAnoPubicacao() <= anoFinal){
                    livroPorIntervaloAnos.add(l);
                }
            }
        }
        return livroPorIntervaloAnos;
    }



        public Livro pesquisarPorTitulo(String titulo){
            Livro livroPorTitulo = null;
            if ( !livroList.isEmpty()){
                for(Livro l : livroList){
                    if(l.getTitulo().equalsIgnoreCase(titulo)){
                        livroPorTitulo = l;
                        break;
                    }
                }
            }
            return livroPorTitulo;
        }

        public static void main (String[] args){
            CatalogoLivros catalogoLivros = new CatalogoLivros();
            catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2011);
            catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2001);
            catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2002);
            catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2003);
            catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2004);

            System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
            System.out.println(catalogoLivros.pesquisarIntervaloAnos(2002,2002));
            System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));


        }



}
