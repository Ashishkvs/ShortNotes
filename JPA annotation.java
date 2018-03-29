packages 
//
import javax.persistence.*;
import javax.validation.constraints.Email; //@NOT NULL,@Email,@Size


@Entity
@Table(name="user")

//Primary Key
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY/AUTO
//FOR COLUMN LEVEL
@NOT NULL
@Email
@Size(max=65)
@Column(name="user_col",unique=true)

@OneToOne(fetch = FetchType.LAZY/EAGER,
            cascade =  CascadeType.ALL,
            mappedBy = "user")
                
@OneToMany
@JoinTable(name="New_TABLE_NAME",columns=@JoinColumn=(name="Current_CLASS_PK COLUM REF"),inverseJoincolumn=@JoinColumn(name="REF_CLASS_PK_COLUMN_NAME"))
