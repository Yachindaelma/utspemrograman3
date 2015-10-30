/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akuntan;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "t_jual", catalog = "property", schema = "")
@NamedQueries({
    @NamedQuery(name = "TJual.findAll", query = "SELECT t FROM TJual t"),
    @NamedQuery(name = "TJual.findByNomor", query = "SELECT t FROM TJual t WHERE t.nomor = :nomor"),
    @NamedQuery(name = "TJual.findByTanggal", query = "SELECT t FROM TJual t WHERE t.tanggal = :tanggal"),
    @NamedQuery(name = "TJual.findByIDJual", query = "SELECT t FROM TJual t WHERE t.iDJual = :iDJual"),
    @NamedQuery(name = "TJual.findByIDCostumer", query = "SELECT t FROM TJual t WHERE t.iDCostumer = :iDCostumer"),
    @NamedQuery(name = "TJual.findByIDUnit", query = "SELECT t FROM TJual t WHERE t.iDUnit = :iDUnit"),
    @NamedQuery(name = "TJual.findByHargaJual", query = "SELECT t FROM TJual t WHERE t.hargaJual = :hargaJual"),
    @NamedQuery(name = "TJual.findByDp", query = "SELECT t FROM TJual t WHERE t.dp = :dp"),
    @NamedQuery(name = "TJual.findByTelahDibayar", query = "SELECT t FROM TJual t WHERE t.telahDibayar = :telahDibayar"),
    @NamedQuery(name = "TJual.findByTerhutang", query = "SELECT t FROM TJual t WHERE t.terhutang = :terhutang"),
    @NamedQuery(name = "TJual.findByBayar", query = "SELECT t FROM TJual t WHERE t.bayar = :bayar"),
    @NamedQuery(name = "TJual.findByKeterangan", query = "SELECT t FROM TJual t WHERE t.keterangan = :keterangan")})
public class TJual implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Nomor")
    private int nomor;
    @Basic(optional = false)
    @Column(name = "Tanggal")
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Jual")
    private String iDJual;
    @Basic(optional = false)
    @Column(name = "ID_Costumer")
    private String iDCostumer;
    @Basic(optional = false)
    @Column(name = "ID_Unit")
    private String iDUnit;
    @Basic(optional = false)
    @Column(name = "Harga_Jual")
    private float hargaJual;
    @Basic(optional = false)
    @Column(name = "DP")
    private float dp;
    @Basic(optional = false)
    @Column(name = "Telah_Dibayar")
    private float telahDibayar;
    @Basic(optional = false)
    @Column(name = "Terhutang")
    private float terhutang;
    @Basic(optional = false)
    @Column(name = "Bayar")
    private float bayar;
    @Basic(optional = false)
    @Column(name = "Keterangan")
    private String keterangan;

    public TJual() {
    }

    public TJual(String iDJual) {
        this.iDJual = iDJual;
    }

    public TJual(String iDJual, int nomor, Date tanggal, String iDCostumer, String iDUnit, float hargaJual, float dp, float telahDibayar, float terhutang, float bayar, String keterangan) {
        this.iDJual = iDJual;
        this.nomor = nomor;
        this.tanggal = tanggal;
        this.iDCostumer = iDCostumer;
        this.iDUnit = iDUnit;
        this.hargaJual = hargaJual;
        this.dp = dp;
        this.telahDibayar = telahDibayar;
        this.terhutang = terhutang;
        this.bayar = bayar;
        this.keterangan = keterangan;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        int oldNomor = this.nomor;
        this.nomor = nomor;
        changeSupport.firePropertyChange("nomor", oldNomor, nomor);
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        Date oldTanggal = this.tanggal;
        this.tanggal = tanggal;
        changeSupport.firePropertyChange("tanggal", oldTanggal, tanggal);
    }

    public String getIDJual() {
        return iDJual;
    }

    public void setIDJual(String iDJual) {
        String oldIDJual = this.iDJual;
        this.iDJual = iDJual;
        changeSupport.firePropertyChange("IDJual", oldIDJual, iDJual);
    }

    public String getIDCostumer() {
        return iDCostumer;
    }

    public void setIDCostumer(String iDCostumer) {
        String oldIDCostumer = this.iDCostumer;
        this.iDCostumer = iDCostumer;
        changeSupport.firePropertyChange("IDCostumer", oldIDCostumer, iDCostumer);
    }

    public String getIDUnit() {
        return iDUnit;
    }

    public void setIDUnit(String iDUnit) {
        String oldIDUnit = this.iDUnit;
        this.iDUnit = iDUnit;
        changeSupport.firePropertyChange("IDUnit", oldIDUnit, iDUnit);
    }

    public float getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(float hargaJual) {
        float oldHargaJual = this.hargaJual;
        this.hargaJual = hargaJual;
        changeSupport.firePropertyChange("hargaJual", oldHargaJual, hargaJual);
    }

    public float getDp() {
        return dp;
    }

    public void setDp(float dp) {
        float oldDp = this.dp;
        this.dp = dp;
        changeSupport.firePropertyChange("dp", oldDp, dp);
    }

    public float getTelahDibayar() {
        return telahDibayar;
    }

    public void setTelahDibayar(float telahDibayar) {
        float oldTelahDibayar = this.telahDibayar;
        this.telahDibayar = telahDibayar;
        changeSupport.firePropertyChange("telahDibayar", oldTelahDibayar, telahDibayar);
    }

    public float getTerhutang() {
        return terhutang;
    }

    public void setTerhutang(float terhutang) {
        float oldTerhutang = this.terhutang;
        this.terhutang = terhutang;
        changeSupport.firePropertyChange("terhutang", oldTerhutang, terhutang);
    }

    public float getBayar() {
        return bayar;
    }

    public void setBayar(float bayar) {
        float oldBayar = this.bayar;
        this.bayar = bayar;
        changeSupport.firePropertyChange("bayar", oldBayar, bayar);
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        String oldKeterangan = this.keterangan;
        this.keterangan = keterangan;
        changeSupport.firePropertyChange("keterangan", oldKeterangan, keterangan);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDJual != null ? iDJual.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TJual)) {
            return false;
        }
        TJual other = (TJual) object;
        if ((this.iDJual == null && other.iDJual != null) || (this.iDJual != null && !this.iDJual.equals(other.iDJual))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "akuntan.TJual[ iDJual=" + iDJual + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
