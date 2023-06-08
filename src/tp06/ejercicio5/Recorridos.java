package tp06.ejercicio5;

import tp02.ejercicio2.*;
import tp02.ejercicio3.ColaGenerica;
import tp06.ejercicio3.*;

public class Recorridos {
	//No me permite usar el tipo T
	private void dfs (Grafo<Integer> grafo, boolean [] visitados, Vertice v){
		visitados[v.getPosicion()]=true;
		//Proceso, por ejempo:
		System.out.println(v.dato());
		ListaGenerica<Arista<Integer>> adyacentes = grafo.listaDeAdyacentes(v);
		adyacentes.comenzar();
		while (!adyacentes.fin()) {
			Vertice destino=adyacentes.proximo().verticeDestino();
			if (!visitados[destino.getPosicion()])
				dfs(grafo, visitados, destino);
		}
	}

	public ListaGenerica<Vertice<Integer>> dfs (Grafo<Integer> grafo){
		boolean[] visitados = new boolean [grafo.listaDeVertices().tamanio()];
		ListaGenerica<Vertice<Integer>> vertices = grafo.listaDeVertices();
		vertices.comenzar();
		while (!vertices.fin()) {
			Vertice v = vertices.proximo();
			if (!visitados[v.getPosicion()])
				dfs(grafo, visitados, v);
		}
		return vertices;
	}
	
	public ListaGenerica<Vertice<Integer>> bfs (Grafo<Integer> grafo){
		boolean[] visitados = new boolean [grafo.listaDeVertices().tamanio()];
		ListaGenerica<Vertice<Integer>> vertices = grafo.listaDeVertices();
		vertices.comenzar();
		ColaGenerica<Vertice<Integer>> cola= new ColaGenerica<Vertice<Integer>>();
		Vertice actual;
		ListaGenerica<Vertice<Integer>> recorrido = new ListaEnlazadaGenerica<Vertice<Integer>>();
		while(!vertices.fin()) {
			actual=vertices.proximo();
			if (visitados[actual.getPosicion()]==false) {
				//recorrido.agregarFinal(ady);
				cola.encolar(actual);
				visitados[actual.getPosicion()]=true;
			}
			ListaGenerica<Arista<Integer>> adyacentes = grafo.listaDeAdyacentes(actual);
			adyacentes.comenzar();
			while (!adyacentes.fin()) {
				Vertice ady = adyacentes.proximo().verticeDestino();
				if (visitados[ady.getPosicion()]==false) {
					//recorrido.agregarFinal(ady);
					cola.encolar(ady);
					visitados[actual.getPosicion()]=true;
				}
			}
			recorrido.agregarFinal(cola.desencolar());
	}return recorrido;
	}
}
