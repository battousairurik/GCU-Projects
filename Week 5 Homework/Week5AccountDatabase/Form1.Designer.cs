namespace Week5AccountDatabase
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.checking_account_balance = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.savings_account_balance = new System.Windows.Forms.Label();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.process_button = new System.Windows.Forms.Button();
            this.processing_amount = new System.Windows.Forms.Label();
            this.button2 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.help_button = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(12, 45);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(190, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "Savings Account Balance";
            // 
            // checking_account_balance
            // 
            this.checking_account_balance.AutoSize = true;
            this.checking_account_balance.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.checking_account_balance.Location = new System.Drawing.Point(240, 9);
            this.checking_account_balance.Name = "checking_account_balance";
            this.checking_account_balance.Size = new System.Drawing.Size(51, 20);
            this.checking_account_balance.TabIndex = 1;
            this.checking_account_balance.Text = "label2";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(12, 9);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(200, 20);
            this.label3.TabIndex = 2;
            this.label3.Text = "Checking Account Balance";
            // 
            // savings_account_balance
            // 
            this.savings_account_balance.AutoSize = true;
            this.savings_account_balance.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.savings_account_balance.Location = new System.Drawing.Point(240, 45);
            this.savings_account_balance.Name = "savings_account_balance";
            this.savings_account_balance.Size = new System.Drawing.Size(51, 20);
            this.savings_account_balance.TabIndex = 3;
            this.savings_account_balance.Text = "label4";
            // 
            // textBox1
            // 
            this.textBox1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBox1.Location = new System.Drawing.Point(16, 178);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(150, 26);
            this.textBox1.TabIndex = 4;
            this.textBox1.Text = "Enter Amount";
            // 
            // process_button
            // 
            this.process_button.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.process_button.Location = new System.Drawing.Point(191, 178);
            this.process_button.Name = "process_button";
            this.process_button.Size = new System.Drawing.Size(100, 26);
            this.process_button.TabIndex = 5;
            this.process_button.Text = "Process";
            this.process_button.UseVisualStyleBackColor = true;
            this.process_button.Click += new System.EventHandler(this.process_click);
            // 
            // processing_amount
            // 
            this.processing_amount.AutoSize = true;
            this.processing_amount.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.processing_amount.Location = new System.Drawing.Point(315, 181);
            this.processing_amount.Name = "processing_amount";
            this.processing_amount.Size = new System.Drawing.Size(51, 20);
            this.processing_amount.TabIndex = 6;
            this.processing_amount.Text = "label5";
            // 
            // button2
            // 
            this.button2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button2.Location = new System.Drawing.Point(423, 171);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(125, 40);
            this.button2.TabIndex = 7;
            this.button2.Text = "To Savings";
            this.button2.UseVisualStyleBackColor = true;
            // 
            // button3
            // 
            this.button3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button3.Location = new System.Drawing.Point(423, 217);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(125, 40);
            this.button3.TabIndex = 8;
            this.button3.Text = "To Checking";
            this.button3.UseVisualStyleBackColor = true;
            // 
            // help_button
            // 
            this.help_button.Location = new System.Drawing.Point(497, 12);
            this.help_button.Name = "help_button";
            this.help_button.Size = new System.Drawing.Size(75, 23);
            this.help_button.TabIndex = 9;
            this.help_button.Text = "Help ?";
            this.help_button.UseVisualStyleBackColor = true;
            this.help_button.Click += new System.EventHandler(this.help_click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(584, 361);
            this.Controls.Add(this.help_button);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.processing_amount);
            this.Controls.Add(this.process_button);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.savings_account_balance);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.checking_account_balance);
            this.Controls.Add(this.label1);
            this.MaximizeBox = false;
            this.Name = "Form1";
            this.Text = "Account Transfers";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label checking_account_balance;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label savings_account_balance;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Button process_button;
        private System.Windows.Forms.Label processing_amount;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button help_button;
    }
}

