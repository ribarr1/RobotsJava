package com.greensqa.ctifcarga.ral.dto;

import java.util.Date;

public class MAE_CONTRATOS_DIAS_MORA {
	String cod_entidad;
	String cod_legado;
	String id_tanda;
	Date fec_creacion;
	String num_contrato;
	String cod_grupo_concepto;
	Integer dias_mora;
	Integer num_cuotas_vencidas;
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
	public String getCod_grupo_concepto() {
		return cod_grupo_concepto;
	}
	public void setCod_grupo_concepto(String cod_grupo_concepto) {
		this.cod_grupo_concepto = cod_grupo_concepto;
	}
	public Integer getDias_mora() {
		return dias_mora;
	}
	public void setDias_mora(Integer dias_mora) {
		this.dias_mora = dias_mora;
	}
	public Integer getNum_cuotas_vencidas() {
		return num_cuotas_vencidas;
	}
	public void setNum_cuotas_vencidas(Integer num_cuotas_vencidas) {
		this.num_cuotas_vencidas = num_cuotas_vencidas;
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
