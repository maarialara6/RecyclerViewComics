package br.com.etecia.myapp;

public class Comics {
    private String universo;
    private String titulo;
    private int imgComic;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public  String getUniverso(){
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getImgComic() {
        return imgComic;
    }

    public void setImgComic(int imgComic) {
        this.imgComic = imgComic;
    }
}
