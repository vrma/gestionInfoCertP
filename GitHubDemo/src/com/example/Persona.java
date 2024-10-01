package com.example;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {
	
	private LocalDate fechaNacimiento;
	private double salario;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(LocalDate fechaNacimiento, double salario) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.salario = salario;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Persona [fechaNacimiento=" + fechaNacimiento + ", salario=" + salario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaNacimiento, salario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}
	
	
}
