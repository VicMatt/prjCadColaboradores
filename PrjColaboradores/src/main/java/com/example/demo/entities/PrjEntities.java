package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "colaborador")
public class PrjEntities {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   
	   private String ctps;
	   private String pis;
	   private String tituloEleitor;
	   private String reservista;
	   private String estadoCivil;
	   private int numDependentes;
	   private String ativo;
	   private String setor;
	   private String cargo;
	   private float salario;
	   private String telefone1;
	   private String telefone2;
	   private String emailPessoal;
	   private String emailCorporativo;
	   
	   
	   public Long getId(){
	       return id;
	   }
	   
	   public void setId(Long id) {
	       this.id = id;
	   }
	   
	   public String ctps() {
	       return ctps;
	   }
	   
	   public void setctps(String ctps) {
	       this.ctps = ctps;
	   }
	   
	   public String getpis() {
	       return pis;
	   }
	   
	   public void setpis(String pis) {
	       this.pis = pis;
	   }
	   
	   public String gettituloEleitor(){
	       return tituloEleitor;
	   }
	   
	   public void settituloEleitor(String tituloEleitor) {
	       this.tituloEleitor = tituloEleitor;
	   }
	   
	   public String getreservista(){
	       return reservista;
	   }
	   
	   public void setreservista(String reservista) {
	       this.reservista = reservista;
	   }
	   
	   public String getestadoCivil(){
	       return estadoCivil;
	   }
	   
	   public void setestadoCivil(String estadoCivil) {
	       this.estadoCivil = estadoCivil;
	   }
	   
	   public int getnumDependentes(){
	       return numDependentes;
	   }
	   
	   public void setEmail(int numDependentes) {
	       this.numDependentes = numDependentes;
	   }
	   
	   public String getativo(){
	       return ativo;
	   }
	   
	   public void setativo(String ativo) {
	       this.ativo = ativo;
	   }
	   
	   public String getsetor(){
	       return setor;
	   }
	   
	   public void setsetor(String setor) {
	       this.setor = setor;
	   }
	   
	   public String getcargo(){
	       return cargo;
	   }
	   
	   public void setcargo(String cargo) {
	       this.cargo = cargo;
	   }
	   
	   public float getsalario(){
	       return salario;
	   }
	   
	   public void setsalario(float salario) {
	       this.salario = salario;
	   }
	   
	   public String gettelefone1(){
	       return telefone1;
	   }
	   
	   public void settelefone1(String telefone1) {
	       this.telefone1 = telefone1;
	   }
	   
	   public String gettelefone2(){
	       return telefone2;
	   }
	   
	   public void settelefone2(String telefone2) {
	       this.telefone2 = telefone2;
	   }
	   
	   public String getemailPessoal(){
	       return emailPessoal;
	   }
	   
	   public void setemailPessoal(String emailPessoal) {
	       this.emailPessoal = emailPessoal;
	   }
	   
	   public String getemailCorporativo(){
	       return emailCorporativo;
	   }
	   
	   public void setemailCorporativo(String emailCorporativo) {
	       this.emailCorporativo = emailCorporativo;
	   }
	

}
