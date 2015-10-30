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
@Table(name = "customer", catalog = "property", schema = "")
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findByIDCostumer", query = "SELECT c FROM Customer c WHERE c.iDCostumer = :iDCostumer"),
    @NamedQuery(name = "Customer.findByNama", query = "SELECT c FROM Customer c WHERE c.nama = :nama"),
    @NamedQuery(name = "Customer.findByPekerjaan", query = "SELECT c FROM Customer c WHERE c.pekerjaan = :pekerjaan"),
    @NamedQuery(name = "Customer.findByStatusPerkawinan", query = "SELECT c FROM Customer c WHERE c.statusPerkawinan = :statusPerkawinan"),
    @NamedQuery(name = "Customer.findByNomorKTP", query = "SELECT c FROM Customer c WHERE c.nomorKTP = :nomorKTP"),
    @NamedQuery(name = "Customer.findByNomorNPWP", query = "SELECT c FROM Customer c WHERE c.nomorNPWP = :nomorNPWP"),
    @NamedQuery(name = "Customer.findByTelepon", query = "SELECT c FROM Customer c WHERE c.telepon = :telepon"),
    @NamedQuery(name = "Customer.findByEmail", query = "SELECT c FROM Customer c WHERE c.email = :email"),
    @NamedQuery(name = "Customer.findByAlamat", query = "SELECT c FROM Customer c WHERE c.alamat = :alamat")})
public class Customer implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
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

    public Customer() {
    }

    public Customer(String iDCostumer) {
        this.iDCostumer = iDCostumer;
    }

    public Customer(String iDCostumer, String nama, String pekerjaan, String statusPerkawinan, int nomorKTP, int nomorNPWP, int telepon, String email, String alamat) {
        this.iDCostumer = iDCostumer;
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.statusPerkawinan = statusPerkawinan;
        this.nomorKTP = nomorKTP;
        this.nomorNPWP = nomorNPWP;
        this.telepon = telepon;
        this.email = email;
        this.alamat = alamat;
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
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.iDCostumer == null && other.iDCostumer != null) || (this.iDCostumer != null && !this.iDCostumer.equals(other.iDCostumer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "akuntan.Customer[ iDCostumer=" + iDCostumer + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
