package br.com.fiap.banco;

import java.io.Serializable;

/* Documentação do JAVA
 * https://docs.oracle.com/javase/8/docs/api/
 */

/**
 * 
 * @author Gustavo Bueno
 * @version 1.0
 *
 */

public class Conta implements Serializable{
	
	/**
	 * Número da Agência
	 */
	//Atributos da Classe
	private int agencia;
	/**
	 * Número da Conta
	 */
	private int numero;
	/**
	 * Saldo da Conta
	 */
	private double saldo;
	
	//Construtores da Classe Conta
	public Conta() {	
	}
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	/**Acrescenta valor ao Saldo
	 * @param valor que será depositado
	 * */
	public void depositar(double valor) {
		this.saldo += valor;
	}
	/**
	 * retira valor da conta
	 * @param valor que será retirado
	 */
	public void retirar (double valor) {
		this.saldo -= valor;
	}
	
	/**
	 * Verifica o salkdo da Conta
	 * @return valor do Saldo da Conta
	 */
	public double getSaldo() {
		return this.saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
