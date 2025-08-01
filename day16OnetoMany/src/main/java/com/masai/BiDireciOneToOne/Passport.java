package com.masai.BiDireciOneToOne;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PASSPORT")
public class Passport {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "PID")
        private int pid;

        @Column(name = "PNUMBER")
        private String pnumber;

        @OneToOne( mappedBy = "passport", cascade = CascadeType.ALL)
        @JoinColumn(name="PID")
        private Citizen citizen;

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getPnumber() {
			return pnumber;
		}

		public void setPnumber(String pnumber) {
			this.pnumber = pnumber;
		}

		public Citizen getCitizen() {
			return citizen;
		}

		public void setCitizen(Citizen citizen) {
			this.citizen = citizen;
		}

			//getters and setter
        
        

	}