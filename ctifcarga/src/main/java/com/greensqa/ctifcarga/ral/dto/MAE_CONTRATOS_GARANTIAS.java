package com.greensqa.ctifcarga.ral.dto;

import java.util.Date;

public class MAE_CONTRATOS_GARANTIAS {
	String cod_entidad;
	String cod_legado;
	String id_tanda;
	Date fec_creacion;
	String num_contrato;
	Integer porctj_idonea;
	Integer porctj_otras;
	Date fec_corte_contbl;
	String id_fila_origen_legado;
	Integer id_fila_inbox;
	String estado_registro;
	Integer id_export;
	Date fecha_export;
	String usuario_creacion;
	Date fec_actualiz;
	String usuario_actualizacion;
	
	public String getCod_entidad() {
		return cod_entidad;
	}
	public void setCod_entidad(String cod_entidad) {
		this.cod_entidad = cod_entidad;
	}
	public String getCod_legado() {
		return cod_legado;
	}
	public void setCod_legado(String cod_legado) {
		this.cod_legado = cod_legado;
	}
	public String getId_tanda() {
		return id_tanda;
	}
	public void setId_tanda(String id_tanda) {
		this.id_tanda = id_tanda;
	}
	public Date getFec_creacion() {
		return fec_creacion;
	}
	public void setFec_creacion(Date fec_creacion) {
		this.fec_creacion = fec_creacion;
	}
	public String getNum_contrato() {
		return num_contrato;
	}
	public void setNum_contrato(String num_contrato) {
		this.num_contrato = num_contrato;
	}
	public Integer getPorctj_idonea() {
		return porctj_idonea;
	}
	public void setPorctj_idonea(Integer porctj_idonea) {
		this.porctj_idonea = porctj_idonea;
	}
	public Integer getPorctj_otras() {
		return porctj_otras;
	}
	public void setPorctj_otras(Integer porctj_otras) {
		this.porctj_otras = porctj_otras;
	}
	public Date getFec_corte_contbl() {
		return fec_corte_contbl;
	}
	public void setFec_corte_contbl(Date fec_corte_contbl) {
		this.fec_corte_contbl = fec_corte_contbl;
	}
	public String getId_fila_origen_legado() {
		return id_fila_origen_legado;
	}
	public void setId_fila_origen_legado(String id_fila_origen_legado) {
		this.id_fila_origen_legado = id_fila_origen_legado;
	}
	public Integer getId_fila_inbox() {
		return id_fila_inbox;
	}
	public void setId_fila_inbox(Integer id_fila_inbox) {
		this.id_fila_inbox = id_fila_inbox;
	}
	public String getEstado_registro() {
		return estado_registro;
	}
	public void setEstado_registro(String estado_registro) {
		this.estado_registro = estado_registro;
	}
	public Integer getId_export() {
		return id_export;
	}
	public void setId_export(Integer id_export) {
		this.id_export = id_export;
	}
	public Date getFecha_export() {
		return fecha_export;
	}
	public void setFecha_export(Date fecha_export) {
		this.fecha_export = fecha_export;
	}
	public String getUsuario_creacion() {
		return usuario_creacion;
	}
	public void setUsuario_creacion(String usuario_creacion) {
		this.usuario_creacion = usuario_creacion;
	}
	public Date getFec_actualiz() {
		return fec_actualiz;
	}
	public void setFec_actualiz(Date fec_actualiz) {
		this.fec_actualiz = fec_actualiz;
	}
	public String getUsuario_actualizacion() {
		return usuario_actualizacion;
	}
	public void setUsuario_actualizacion(String usuario_actualizacion) {
		this.usuario_actualizacion = usuario_actualizacion;
	}
}
