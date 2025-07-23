package com.masai.BiDireciOneToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity

@Table(name = "CITIZEN")

public class Citizen {

       

       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "CID")
        private int cid;

        @Column(name = "CNAME")
        private String cname;

        @OneToOne
        @PrimaryKeyJoinColumn
        private Passport passport;

		int getCid() {
			return cid;
		}

		void setCid(int cid) {
			this.cid = cid;
		}

		String getCname() {
			return cname;
		}

		void setCname(String cname) {
			this.cname = cname;
		}

		Passport getPassport() {
			return passport;
		}

		void setPassport(Passport passport) {
			this.passport = passport;
		}

				//getters and setters

}