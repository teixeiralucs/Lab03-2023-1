package linked;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No cabeca;

    public ListaLigada() {
        cabeca = null;

    }

    @Override
    public boolean buscaElemento(int valor) {

        No elemento = new No (valor);
        elemento = this.cabeca;

        while(true){
            if (elemento != null){
                if(elemento.getValor()==valor){
                    return(true);
                }
                else{
                    elemento = elemento.getProximo();
                }
            else{
                break;
            }
            }
        }
        return (false);

    }

    @Override
    public int buscaIndice(int valor) {
        No indice = new No (valor);
        indice = this.cabeca;
        int contador = 0;
        while(true){
            if(indice != null){
                if(valor == contador){
                    return indice.getValor();
                }
                else{
                    indice = indice.getProximo();
                }
                contador += 1;
            }
        }

    }

    @Override
    public int minimo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'minimo'");
    }

    @Override
    public int maximo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maximo'");
    }

    @Override
    public int predecessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'predecessor'");
    }

    @Override
    public int sucessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
    }

    @Override
    public void insereElemento(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElemento'");
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElementoPosicao'");
    }

    @Override
    public void insereInicio(int valor) {
        if (this.cabeca == null){
            this.cabeca = new No(valor);
        }
        else {
            No n = new No(valor);
            n.setProximo(this.cabeca);
            this.cabeca = n;
        }
        
    }

    @Override
    public void insereFim(int valor) {
        No n = new No (valor);
        if(cabeca == null){
            cabeca = n;
        }
        else {
            No atual = cabeca;
            while(atual.getProximo()!= null){
                atual = atual.getProximo();
            }
            atual.setProximo(n);
        }
            }

    @Override
    public void remove(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void removeIndice(int indice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    @Override
    public void removeInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    @Override
    public void removeFim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }
    
}
