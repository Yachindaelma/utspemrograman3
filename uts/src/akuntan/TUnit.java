/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akuntan;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "t_unit", catalog = "property", schema = "")
@NamedQueries({
    @NamedQuery(name = "TUnit.findAll", query = "SELECT t FROM TUnit t"),
    @NamedQuery(name = "TUnit.findByNomor", query = "SELECT t FROM TUnit t WHERE t.nomor = :nomor"),
    @NamedQuery(name = "TUnit.findByIDUnit", query = "SELECT t FROM TUnit t WHERE t.iDUnit = :iDUnit"),
    @NamedQuery(name = "TUnit.findByIDSuplier", query = "SELECT t FROM TUnit t WHERE t.iDSuplier = :iDSuplier"),
    @NamedQuery(name = "TUnit.findByTipe", query = "SELECT t FROM TUnit t WHERE t.tipe = :tipe"),
    @NamedQuery(name = "TUnit.findByLuas", query = "SELECT t FROM TUnit t WHERE t.luas = :luas"),
    @NamedQuery(name = "TUnit.findByNoUnit", query = "SELECT t FROM TUnit t WHERE t.noUnit = :noUnit"),
    @NamedQuery(name = "TUnit.findByIdPic", query = "SELECT t FROM TUnit t WHERE t.idPic = :idPic"),
    @NamedQuery(name = "TUnit.findByPic", query = "SELECT t FROM TUnit t WHERE t.pic = :pic"),
    @NamedQuery(name = "TUnit.findByHargaJualatauSewa", query = "SELECT t FROM TUnit t WHERE t.hargaJualatauSewa = :hargaJualatauSewa"),
    @NamedQuery(name = "TUnit.findBySistemBayar", query = "SELECT t FROM TUnit t WHERE t.sistemBayar = :sistemBayar"),
    @NamedQuery(name = "TUnit.findByPeruntukan", query = "SELECT t FROM TUnit t WHERE t.peruntukan = :peruntukan")})
public class TUnit implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Nomor")
    private int nomor;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Unit")
    private String iDUnit;
    @Basic(optional = false)
    @Column(name = "ID_Suplier")
    private String iDSuplier;
    @Basic(optional = false)
    @Column(name = "Tipe")
    private String tipe;
    @Basic(optional = false)
    @Column(name = "Luas")
    private String luas;
    @Basic(optional = false)
    @Column(name = "No_Unit")
    private String noUnit;
    @Basic(optional = false)
    @Column(name = "ID_PIC")
    private String idPic;
    @Basic(optional = false)
    @Column(name = "PIC")
    private String pic;
    @Basic(optional = false)
    @Column(name = "Harga_Jual_atau_Sewa")
    private float hargaJualatauSewa;
    @Basic(optional = false)
    @Column(name = "Sistem_Bayar")
    private String sistemBayar;
    @Basic(optional = false)
    @Column(name = "Peruntukan")
    private String peruntukan;

    public TUnit() {
    }

    public TUnit(String iDUnit) {
        this.iDUnit = iDUnit;
    }

    public TUnit(String iDUnit, int nomor, String iDSuplier, String tipe, String luas, String noUnit, String idPic, String pic, float hargaJualatauSewa, String sistemBayar, String peruntukan) {
        this.iDUnit = iDUnit;
        this.nomor = nomor;
        this.iDSuplier = iDSuplier;
        this.tipe = tipe;
        this.luas = luas;
        this.noUnit = noUnit;
        this.idPic = idPic;
        this.pic = pic;
        this.hargaJualatauSewa = hargaJualatauSewa;
        this.sistemBayar = sistemBayar;
        this.peruntukan = peruntukan;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        int oldNomor = this.nomor;
        this.nomor = nomor;
        changeSupport.firePropertyChange("nomor", oldNomor, nomor);
    }

    public String getIDUnit() {
        return iDUnit;
    }

    public void setIDUnit(String iDUnit) {
        String oldIDUnit = this.iDUnit;
        this.iDUnit = iDUnit;
        changeSupport.firePropertyChange("IDUnit", oldIDUnit, iDUnit);
    }

    public String getIDSuplier() {
        return iDSuplier;
    }

    public void setIDSuplier(String iDSuplier) {
        String oldIDSuplier = this.iDSuplier;
        this.iDSuplier = iDSuplier;
        changeSupport.firePropertyChange("IDSuplier", oldIDSuplier, iDSuplier);
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        String oldTipe = this.tipe;
        this.tipe = tipe;
        changeSupport.firePropertyChange("tipe", oldTipe, tipe);
    }

    public String getLuas() {
        return luas;
    }

    public void setLuas(String luas) {
        String oldLuas = this.luas;
        this.luas = luas;
        changeSupport.firePropertyChange("luas", oldLuas, luas);
    }

    public String getNoUnit() {
        return noUnit;
    }

    public void setNoUnit(String noUnit) {
        String oldNoUnit = this.noUnit;
        this.noUnit = noUnit;
        changeSupport.firePropertyChange("noUnit", oldNoUnit, noUnit);
    }

    public String getIdPic() {
        return idPic;
    }

    public void setIdPic(String idPic) {
        String oldIdPic = this.idPic;
        this.idPic = idPic;
        changeSupport.firePropertyChange("idPic", oldIdPic, idPic);
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        String oldPic = this.pic;
        this.pic = pic;
        changeSupport.firePropertyChange("pic", oldPic, pic);
    }

    public float getHargaJualatauSewa() {
        return hargaJualatauSewa;
    }

    public void setHargaJualatauSewa(float hargaJualatauSewa) {
        float oldHargaJualatauSewa = this.hargaJualatauSewa;
        this.hargaJualatauSewa = hargaJualatauSewa;
        changeSupport.firePropertyChange("hargaJualatauSewa", oldHargaJualatauSewa, hargaJualatauSewa);
    }

    public String getSistemBayar() {
        return sistemBayar;
    }

    public void setSistemBayar(String sistemBayar) {
        String oldSistemBayar = this.sistemBayar;
        this.sistemBayar = sistemBayar;
        changeSupport.firePropertyChange("sistemBayar", oldSistemBayar, sistemBayar);
    }

    public String getPeruntukan() {
        return peruntukan;
    }

    public void setPeruntukan(String peruntukan) {
        String oldPeruntukan = this.peruntukan;
        this.peruntukan = peruntukan;
        changeSupport.firePropertyChange("peruntukan", oldPeruntukan, peruntukan);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDUnit != null ? iDUnit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TUnit)) {
            return false;
        }
        TUnit other = (TUnit) object;
        if ((this.iDUnit == null && other.iDUnit != null) || (this.iDUnit != null && !this.iDUnit.equals(other.iDUnit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "akuntan.TUnit[ iDUnit=" + iDUnit + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
