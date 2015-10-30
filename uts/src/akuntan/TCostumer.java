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
@Table(name = "t_costumer", catalog = "akuntan_kita_property", schema = "")
@NamedQueries({
    @NamedQuery(name = "TCostumer.findAll", query = "SELECT t FROM TCostumer t"),
    @NamedQuery(name = "TCostumer.findByNomor", query = "SELECT t FROM TCostumer t WHERE t.nomor = :nomor"),
    @NamedQuery(name = "TCostumer.findByIDCostumer", query = "SELECT t FROM TCostumer t WHERE t.iDCostumer = :iDCostumer"),
    @NamedQuery(name = "TCostumer.findByNama", query = "SELECT t FROM TCostumer t WHERE t.nama = :nama"),
    @NamedQuery(name = "TCostumer.findByPekerjaan", query = "SELECT t FROM TCostumer t WHERE t.pekerjaan = :pekerjaan"),
    @NamedQuery(name = "TCostumer.findByStatusPerkawinan", query = "SELECT t FROM TCostumer t WHERE t.statusPerkawinan = :statusPerkawinan"),
    @NamedQuery(name = "TCostumer.findByNomorKTP", query = "SELECT t FROM TCostumer t WHERE t.nomorKTP = :nomorKTP"),
    @NamedQuery(name = "TCostumer.findByNomorNPWP", query = "SELECT t FROM TCostumer t WHERE t.nomorNPWP = :nomorNPWP"),
    @NamedQuery(name = "TCostumer.findByTelepon", query = "SELECT t FROM TCostumer t WHERE t.telepon = :telepon"),
    @NamedQuery(name = "TCostumer.findByEmail", query = "SELECT t FROM TCostumer t WHERE t.email = :email"),
    @NamedQuery(name = "TCostumer.findByAlamat", query = "SELECT t FROM TCostumer t WHERE t.alamat = :alamat")})
public class TCostumer implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Nomor")
    private int nomor;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Costumer")
    private String iDCostumer;
    @Basic(optional = false)
    @Column(name = "Nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "Pekerjaan")
    private String pekerjaan;
    @Basic(optional = false)
    @Column(name = "Status_Perkawinan")
    private String statusPerkawinan;
    @Basic(optional = false)
    @Column(name = "Nomor_KTP")
    private int nomorKTP;
    @Basic(optional = false)
    @Column(name = "Nomor_NPWP")
    private int nomorNPWP;
    @Basic(optional = false)
    @Column(name = "Telepon")
    private int telepon;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Alamat")
    private String alamat;

    public TCostumer() {
    }

    public TCostumer(String iDCostumer) {
        this.iDCostumer = iDCostumer;
    }

    public TCostumer(String iDCostumer, int nomor, String nama, String pekerjaan, String statusPerkawinan, int nomorKTP, int nomorNPWP, int telepon, String email, String alamat) {
        this.iDCostumer = iDCostumer;
        this.nomor = nomor;
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.statusPerkawinan = statusPerkawinan;
        this.nomorKTP = nomorKTP;
        this.nomorNPWP = nomorNPWP;
        this.telepon = telepon;
        this.email = email;
        this.alamat = alamat;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        int oldNomor = this.nomor;
        this.nomor = nomor;
        changeSupport.firePropertyChange("nomor", oldNomor, nomor);
    }

    public String getIDCostumer() {
        return iDCostumer;
    }

    public void setIDCostumer(String iDCostumer) {
        String oldIDCostumer = this.iDCostumer;
        this.iDCostumer = iDCostumer;
        changeSupport.firePropertyChange("IDCostumer", oldIDCostumer, iDCostumer);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        String oldPekerjaan = this.pekerjaan;
        this.pekerjaan = pekerjaan;
        changeSupport.firePropertyChange("pekerjaan", oldPekerjaan, pekerjaan);
    }

    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        String oldStatusPerkawinan = this.statusPerkawinan;
        this.statusPerkawinan = statusPerkawinan;
        changeSupport.firePropertyChange("statusPerkawinan", oldStatusPerkawinan, statusPerkawinan);
    }

    public int getNomorKTP() {
        return nomorKTP;
    }

    public void setNomorKTP(int nomorKTP) {
        int oldNomorKTP = this.nomorKTP;
        this.nomorKTP = nomorKTP;
        changeSupport.firePropertyChange("nomorKTP", oldNomorKTP, nomorKTP);
    }

    public int getNomorNPWP() {
        return nomorNPWP;
    }

    public void setNomorNPWP(int nomorNPWP) {
        int oldNomorNPWP = this.nomorNPWP;
        this.nomorNPWP = nomorNPWP;
        changeSupport.firePropertyChange("nomorNPWP", oldNomorNPWP, nomorNPWP);
    }

    public int getTelepon() {
        return telepon;
    }

    public void setTelepon(int telepon) {
        int oldTelepon = this.telepon;
        this.telepon = telepon;
        changeSupport.firePropertyChange("telepon", oldTelepon, telepon);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCostumer != null ? iDCostumer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TCostumer)) {
            return false;
        }
        TCostumer other = (TCostumer) object;
        if ((this.iDCostumer == null && other.iDCostumer != null) || (this.iDCostumer != null && !this.iDCostumer.equals(other.iDCostumer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "akuntan.TCostumer[ iDCostumer=" + iDCostumer + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
